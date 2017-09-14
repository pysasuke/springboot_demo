package com.py.springboot.service;

import com.py.springboot.entity.User;

/**
 * UserService
 *
 * @author pysasuke
 * @date 2017/9/13
 */
public interface UserService {
    User selectByPrimaryKey(long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
}
