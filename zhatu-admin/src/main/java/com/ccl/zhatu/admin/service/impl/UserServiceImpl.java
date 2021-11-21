package com.ccl.zhatu.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ccl.zhatu.admin.entity.User;
import com.ccl.zhatu.admin.mapper.UserMapper;
import com.ccl.zhatu.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author chenchunlu
 * @date 2021-11-21 9:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
