package com.sunhao.multimediaaccountshop;

import com.sunhao.multimediaaccountshop.dal.UserMapper;
import com.sunhao.multimediaaccountshop.dal.dataobject.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        System.out.println(userMapper);
        List<UserDO> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}