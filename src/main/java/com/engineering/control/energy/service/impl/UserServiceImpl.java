package com.engineering.control.energy.service.impl;

import com.engineering.control.energy.entity.DtUser;
import com.engineering.control.energy.repository.UserRepository;
import com.engineering.control.energy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public DtUser save(DtUser dtUser) {
        return repository.save(dtUser);
    }
}
