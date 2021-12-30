package com.example.vinneytoy.service;

import com.example.vinneytoy.exception.DuplicateException;
import com.example.vinneytoy.constant.RoleEnum;
import com.example.vinneytoy.mappers.UserMapper;
import com.example.vinneytoy.models.RegisterRequest;
import com.example.vinneytoy.models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class RegisterServiceImpl implements RegisterService {


    @Autowired
    UserMapper userMapper;


    public boolean checkExistedUserName(String username) {
        List<String> listUsername = new ArrayList<>();
        try {
            log.info("Get all user name");
            listUsername = userMapper.selectUsername();
            for (String name : listUsername
            ) {
                if (username.equals(name)) return false;
            }
        } catch (Exception e) {
            log.info("Get all user name fail!");
        }
        return true;
    }

    @Override
    @Transactional
    public User register(RegisterRequest register) {
        if(!checkExistedUserName(register.getUserName())){
            throw new DuplicateException("Existed Username");
        }
        User result = new User();
        BeanUtils.copyProperties(result,register);

        result.setStatus(true);
        result.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        result.setRole(new ArrayList<String>(Arrays.asList(RoleEnum.USER.getValue())));
        // Hash password using BCrypt
        String hashPassword = hashPassword(register.getPassword());
        result.setUserPassword(hashPassword);

        userMapper.register(result);
        return result;
    }

    String hashPassword(String pass){
        return BCrypt.hashpw(pass,BCrypt.gensalt(12));
    }

    @Override
    public User findUserByUsername(String name) {
        return userMapper.findUserByUserName(name);
    }

}
