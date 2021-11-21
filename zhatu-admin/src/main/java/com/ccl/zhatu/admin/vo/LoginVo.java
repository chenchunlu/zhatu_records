package com.ccl.zhatu.admin.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenchunlu
 * @date 2021-11-21 12:55
 */
@Data
public class LoginVo implements Serializable {

    private static final long serialVersionUID = 6274787915131319969L;
    private String name;
    private String password;
}
