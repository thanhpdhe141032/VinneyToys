package com.example.vinneytoy.ultils;

import com.example.vinneytoy.constant.RoleEnum;
import com.example.vinneytoy.dto.UserDto;
import com.example.vinneytoy.models.RegisterRequest;
import com.example.vinneytoy.models.User;
import org.apache.coyote.Request;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

public class UserUtils {
    public static User userUtil(RegisterRequest request) {
        User result = new User();
        BeanUtils.copyProperties(request, result);
        result.setStatus(true);
        result.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        result.setRole(new ArrayList<String>(Arrays.asList(RoleEnum.USER.getValue())));
        // Hash password using BCrypt
        String hashPassword = hashPassword(request.getPassword());
        result.setUserPassword(hashPassword);

        return result;
    }

    public static UserDto toUserDto(User user) {
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setFirstName(user.getFirstName());
        tmp.setPhone(user.getPhone());
        tmp.setRoles(user.getRole());

        return tmp;
    }


    static String hashPassword(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt(12));
    }


}
