package com.chenfeng;

import com.chenfeng.dao.UserDao;
import com.chenfeng.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @author: lgaoyi
 * @date: 2018/2/7 22:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setUserName("chenfeng");
        user.setPassword("123456");
        user.setAge(18);
        userDao.insert(user);
    }
}
