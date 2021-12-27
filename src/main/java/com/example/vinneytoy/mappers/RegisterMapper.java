package com.example.vinneytoy.mappers;

import com.example.vinneytoy.models.Register;
import org.apache.ibatis.annotations.Insert;

public interface RegisterMapper {

    void register(Register register);
    void selectUserId();
}
