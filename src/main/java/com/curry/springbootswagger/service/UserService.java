package com.curry.springbootswagger.service;

import com.curry.springbootswagger.domain.User;

import java.util.List;

public interface UserService {

    List<User> findUser();

    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}
