package com.example.vinneytoy.service;

import com.example.vinneytoy.dto.ResponseDTO;
import com.example.vinneytoy.models.Register;

public interface RegisterService {

    public int getLastUserId();

    public boolean checkExistedUserName(String username) throws Exception;

    public ResponseDTO register(Register register) throws Exception;


}
