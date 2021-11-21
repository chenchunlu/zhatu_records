package com.ccl.zhatu.test;

import com.ccl.zhatu.admin.entity.User;
import com.ccl.zhatu.admin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


/**
 * @author chenchunlu
 * @date  2021-11-06 18:35
 */

@SpringBootTest
@ContextConfiguration
public class SampleTest {

    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("--------------"));
        User user = userMapper.selectById(3);
        System.out.println(user);
    }
}
