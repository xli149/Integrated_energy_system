package com.engineering.control.energy.vo.userInfoVo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserInfoDataVo {

    @JsonProperty("user_info_total")
    private Integer userInfoTotal;

    @JsonProperty("user_info_list")
    private List<UserInfoListVo> userInfoListVo;
}
