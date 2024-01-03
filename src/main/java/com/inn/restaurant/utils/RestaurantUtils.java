package com.inn.restaurant.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RestaurantUtils {

    private RestaurantUtils(){


    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus status) {
        return new ResponseEntity<>("message: "+responseMessage, status);
    }
}
