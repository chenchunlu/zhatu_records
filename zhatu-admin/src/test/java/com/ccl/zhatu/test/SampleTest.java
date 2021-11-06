package com.ccl.zhatu.test;

import com.ccl.zhatu.admin.entity.User;
import com.ccl.zhatu.main.ZhatuRecordsApplication;
import com.ccl.zhatu.admin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author chenchunlu
 * @create 2021-11-06 18:35
 */


@SpringBootTest(classes = ZhatuRecordsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("--------------"));
        User user = userMapper.selectById(3);
        System.out.println(user);
    }
}
