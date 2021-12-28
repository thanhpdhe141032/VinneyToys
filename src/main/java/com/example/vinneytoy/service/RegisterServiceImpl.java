package com.example.vinneytoy.service;

import com.example.vinneytoy.constant.ResponseCode;
import com.example.vinneytoy.constant.ResponseMessage;
import com.example.vinneytoy.dto.ResponseDTO;
import com.example.vinneytoy.mappers.RegisterMapper;
import com.example.vinneytoy.models.Meta;
import com.example.vinneytoy.models.Register;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class RegisterServiceImpl implements RegisterService {


    @Autowired
    RegisterMapper registerMapper;

    @Override
    public int getLastUserId() {
        try {
            log.info("Get latest userId");
            return registerMapper.selectUserId();
        } catch (Exception e) {
            log.info("Get lastest userId fail.", e);
            return -1;
        }
    }

    @Override
    public boolean checkExistedUserName(String username) {
        List<String> listUsername = new ArrayList<>();
        try {
            log.info("Get all user name");
            listUsername = registerMapper.selectUsername();
            for (String name: listUsername
                 ) {
                if(username.equals(listUsername)) return false;
            }
        }catch (Exception e){
            log.info("Get all user name fail!");
        }
        return true;
    }

    @Override
    @Transactional
    public ResponseDTO register(Register register) throws Exception {
        ResponseDTO response = new ResponseDTO();
        register.setAccountId(getLastUserId());
        try {
            log.info("Register user");
            registerMapper.register(register);
            response.setData(register);
            response.setMeta(new Meta(ResponseCode.CODE_OK, ResponseMessage.MESSAGE_OK));
        }
        catch (Exception e){
            log.info("Register user fail");
            response.setData(null);
            response.setMeta(new Meta(ResponseCode.CODE_BAD_REQUEST, ResponseMessage.MESSAGE_FAIL));
        }
        return response;
    }
}
