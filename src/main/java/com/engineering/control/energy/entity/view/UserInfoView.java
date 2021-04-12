package com.engineering.control.energy.entity.view;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserInfoView {

  @Id
  private Integer employeeId;
  private String userName;
  private String userPwd;
  private String name;
  private Integer department;

}
