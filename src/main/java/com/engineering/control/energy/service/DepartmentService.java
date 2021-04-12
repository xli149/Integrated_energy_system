package com.engineering.control.energy.service;

import com.engineering.control.energy.entity.DtDepartments;

public interface DepartmentService {

    public DtDepartments findByName(String name);
}
