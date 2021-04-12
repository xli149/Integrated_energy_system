package com.engineering.control.energy.repository;

import com.engineering.control.energy.entity.DtUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<DtUserInfo, Integer> {

}
