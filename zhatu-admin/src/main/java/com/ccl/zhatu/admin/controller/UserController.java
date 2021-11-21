package com.ccl.zhatu.admin.controller;

import com.ccl.zhatu.admin.entity.User;
import com.ccl.zhatu.admin.service.UserService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenchunlu
 * @date 2021-11-21 9:12
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Api(value = "用户接口", tags = {"字典"})
@Slf4j
public class UserController {
    private UserService service;

    @GetMapping("/listAll")
    public List<User> listAll() {
        return service.selectList(null);
    }
}
