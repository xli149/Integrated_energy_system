package com.engineering.control.energy.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class DtUserInfo {
  @Id
  private Integer employeeId;
  private String name;
  private Integer department;

}
