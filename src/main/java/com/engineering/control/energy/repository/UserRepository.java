package com.engineering.control.energy.repository;


import com.engineering.control.energy.entity.DtUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DtUser, Integer> {


}
