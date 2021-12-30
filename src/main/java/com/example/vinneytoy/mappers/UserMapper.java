package com.example.vinneytoy.mappers;

import com.example.vinneytoy.models.User;

import java.util.List;

public interface UserMapper {

    User register(User register);
    int selectUserId();
    List<String> selectUsername();
    User findUserByUserName(String name);
    User findUserByUserMail(String mail);

}
