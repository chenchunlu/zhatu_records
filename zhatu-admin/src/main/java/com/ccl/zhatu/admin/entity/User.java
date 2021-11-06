package com.ccl.zhatu.admin.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author chenchunlu
 * @create 2021-11-06 18:32
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Long id;
    private String name;
    private String pwd;
    private String sex;
    private String home;
    private String info;
}
