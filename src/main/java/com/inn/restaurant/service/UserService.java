package com.inn.restaurant.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {

    //commented
    ResponseEntity<String> signUp(Map<String,String> requestMap);

}
