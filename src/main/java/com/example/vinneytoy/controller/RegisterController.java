package com.example.vinneytoy.controller;

import com.example.vinneytoy.constant.ResponseCode;
import com.example.vinneytoy.constant.ResponseMessage;
import com.example.vinneytoy.models.Meta;
import com.example.vinneytoy.models.Register;
import com.example.vinneytoy.dto.ResponseDTO;
import com.example.vinneytoy.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@RequestBody Register register){
       ResponseDTO response = new ResponseDTO();
    try{
        response =
    }
    catch (Exception e){
        response.setMeta(new Meta(ResponseCode.CODE_BAD_REQUEST, ResponseMessage.MESSAGE_FAIL));
        response.setData(null);
        log.info(response.getMeta().getCode(),e);
        return ResponseEntity.ok(response);
    }

    }
}
