package com.engineering.control.energy.service.impl;

import com.engineering.control.energy.entity.DtDepartments;
import com.engineering.control.energy.repository.DepartmentRepository;
import com.engineering.control.energy.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public DtDepartments findByName(String name) {
        return repository.findByName(name);
    }
}
