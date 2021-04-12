package com.engineering.control.energy.controller;

import com.engineering.control.energy.entity.DtUser;
import com.engineering.control.energy.entity.DtUserInfo;
import com.engineering.control.energy.entity.view.UserInfoView;
import com.engineering.control.energy.repository.UserInfoViewRepository;
import com.engineering.control.energy.service.DepartmentService;
import com.engineering.control.energy.service.UserInfoService;
import com.engineering.control.energy.service.UserService;
import com.engineering.control.energy.vo.ResultVo;
import com.engineering.control.energy.vo.userInfoVo.UserInfoDataVo;
import com.engineering.control.energy.vo.userInfoVo.UserInfoListVo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@Configuration
@RestController
@RequestMapping("/info")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserService userService;

    @Autowired
    private DepartmentService departmentService;



    @GetMapping("/getAll")
    public ResultVo getAll(@RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize ) {
        Page<UserInfoView> userInfoViewPage = userInfoService.getAll(pageNum, pageSize);
        List<UserInfoView> userInfoViewList = userInfoViewPage.getContent();
        //System.out.println(userInfoViewList);

        //封装ResultVo
        //第一层
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMsg("success");

        //第二层
        UserInfoDataVo userInfoDataVo = new UserInfoDataVo();
        userInfoDataVo.setUserInfoTotal((int)userInfoViewPage.getTotalElements());


        //第三层

        UserInfoListVo userInfoListVo;
        List<UserInfoListVo> userInfoListVoList = new ArrayList<>();

        //遍历page中的每一页个人信息， 添加到userInfoListVo中
        for(UserInfoView userInfo: userInfoViewList){
                userInfoListVo = new UserInfoListVo();
                userInfoListVo.setEmployeeId(userInfo.getEmployeeId());
                userInfoListVo.setUserName(userInfo.getUserName());
                userInfoListVo.setUserPwd(userInfo.getUserPwd());
                userInfoListVo.setName(userInfo.getName());
                userInfoListVo.setDepartmentId(userInfo.getDepartment());

                //添加集合到useInfoListVoList中
                userInfoListVoList.add(userInfoListVo);

        }

        //封装第二层
        userInfoDataVo.setUserInfoListVo(userInfoListVoList);

        //封装第一层
        resultVo.setData(userInfoDataVo);

        return resultVo;

    }


    @PostMapping("/insert")
    @Transactional
    public ResultVo insert(@RequestParam("userName") String userName, @RequestParam("userPwd") String userPwd,
                           @RequestParam("employeeId") String employeeId, @RequestParam("employeeName") String employeeName,
                           @RequestParam("department") String department){

        System.out.println("Hello");
        DtUser user = new DtUser();
        DtUserInfo userInfo = new DtUserInfo();

        user.setUserName(userName);
        user.setUserPwd(userPwd);
        System.out.println("Big integer: " + new Integer(employeeId));
        userInfo.setEmployeeId(new Integer(employeeId));
        System.out.println("get here");
        userInfo.setName(employeeName);
        userInfo.setDepartment(departmentService.findByName(department).getId());

        //保存用户信息

        userService.save(user);
        userInfoService.save(userInfo);

        ResultVo resultVo = new ResultVo(200, "success");

        return resultVo;


    }

}
