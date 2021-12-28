package com.example.vinneytoy.mappers;

import com.example.vinneytoy.models.Register;

import java.util.List;

public interface RegisterMapper {

    Register register(Register register);
    int selectUserId();
    List<String> selectUsername();

}
