package com.engineering.control.energy.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * http 最外层返回对象
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVo <T>{

    //返回代码
    private Integer code;

    //返回提示信息
    private String msg;

    //返回具体内容
    private T data;

    public ResultVo () {


    }

    public ResultVo(Integer code,  String msg) {
        this.code = code;
        this.msg = msg;
    }



}
