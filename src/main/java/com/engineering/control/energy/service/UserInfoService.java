package com.engineering.control.energy.service;

import com.engineering.control.energy.entity.DtUserInfo;
import com.engineering.control.energy.entity.view.UserInfoView;
import org.springframework.data.domain.Page;



public interface UserInfoService {

    /**
     * 1.查询用户所有信息
     * @param pageNum //当前页数
     * @param pageSize //一页显示多少条
     */
    public Page<UserInfoView> getAll(Integer pageNum, Integer pageSize);


    /**
     * 2.通过工号删除一个员工
     */
    public void deletByEmployeeId(Integer employeeId);

    /**
     * 3.保存一员工信息
     */
    public DtUserInfo save(DtUserInfo userInfo);

}
