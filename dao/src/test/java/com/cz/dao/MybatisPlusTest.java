package com.cz.dao;

import com.cz.dao.mapper.UserMapper;
import com.cz.dao.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        // 通过条件构造器查询一个list集合
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
