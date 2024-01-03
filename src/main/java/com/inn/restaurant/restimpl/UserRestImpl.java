package com.inn.restaurant.restimpl;

import com.inn.restaurant.constants.RestaurantConst;
import com.inn.restaurant.rest.UserRest;
import com.inn.restaurant.service.UserService;
import com.inn.restaurant.utils.RestaurantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{

            return userService.signUp(requestMap);

        }catch (Exception e){
            e.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConst.Something_Went_Wrong,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
