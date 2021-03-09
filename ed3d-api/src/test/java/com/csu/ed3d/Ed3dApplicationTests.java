package com.csu.ed3d;

import com.csu.ed3d.domain.User;
import com.csu.ed3d.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.csu.ed3d.persistence")
class Ed3dApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        User user = userService.login("admin", "admin");
        System.out.println(user);
    }

}
