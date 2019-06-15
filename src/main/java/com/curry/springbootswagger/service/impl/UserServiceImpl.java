package com.curry.springbootswagger.service.impl;

import com.curry.springbootswagger.domain.User;
import com.curry.springbootswagger.mapper.UserMapper;
import com.curry.springbootswagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
