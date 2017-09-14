package com.py.springboot.service.impl;

import com.py.springboot.dao.UserMapper;
import com.py.springboot.entity.User;
import com.py.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author pysasuke
 * @date 2017/9/13
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUser(long id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
