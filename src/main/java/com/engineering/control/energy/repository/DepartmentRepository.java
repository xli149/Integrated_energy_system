package com.engineering.control.energy.repository;

import com.engineering.control.energy.entity.DtDepartments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DtDepartments, Integer> {

    DtDepartments findByName(String name);

}
