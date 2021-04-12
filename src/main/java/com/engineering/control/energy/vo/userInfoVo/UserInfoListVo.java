package com.engineering.control.energy.vo.userInfoVo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserInfoListVo {

    @JsonProperty("employee_id")
    private Integer employeeId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_pwd")
    private String userPwd;

    @JsonProperty("name")
    private String name;

    @JsonProperty("department_id")
    private Integer departmentId;

}
