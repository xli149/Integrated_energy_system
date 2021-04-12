package com.engineering.control.energy.service.impl;

import com.engineering.control.energy.entity.DtUserInfo;
import com.engineering.control.energy.entity.view.UserInfoView;
import com.engineering.control.energy.repository.UserInfoRepository;
import com.engineering.control.energy.repository.UserInfoViewRepository;
import com.engineering.control.energy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoViewRepository userInfoViewRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public Page<UserInfoView> getAll(Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<UserInfoView> page = userInfoViewRepository.findAll(pageable);
        return page;
    }

    @Override
    public void deletByEmployeeId(Integer employeeId) {
        userInfoRepository.deleteById(employeeId);
    }

    @Override
    public DtUserInfo save(DtUserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }
}
