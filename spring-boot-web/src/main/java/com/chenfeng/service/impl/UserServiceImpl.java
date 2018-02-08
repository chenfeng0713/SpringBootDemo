package com.chenfeng.service.impl;

import com.chenfeng.dao.UserDao;
import com.chenfeng.entity.User;
import com.chenfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现
 * @author: lgaoyi
 * @date: 2018/2/8 9:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
