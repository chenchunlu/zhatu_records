package com.ccl.zhatu.admin.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Set;

/**
 * @author chenchunlu
 * @create 2021-11-06 18:32
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Integer id;
    private String name;
    private String pwd;

    }
