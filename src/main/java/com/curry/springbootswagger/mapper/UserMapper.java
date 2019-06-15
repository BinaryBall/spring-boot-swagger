package com.curry.springbootswagger.mapper;


import com.curry.springbootswagger.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findUser();

    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}
