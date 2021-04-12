package com.engineering.control.energy.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class DtUser {
  @Id
  @GeneratedValue
  private Integer id;
  private String userName;
  private String userPwd;

}
