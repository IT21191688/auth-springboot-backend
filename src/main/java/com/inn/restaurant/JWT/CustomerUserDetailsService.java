package com.inn.restaurant.JWT;

import com.inn.restaurant.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;


@Slf4j
@Service
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;
    private com.inn.restaurant.models.User UserDetails;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("inside loadUsername{}",username);
        UserDetails=userDao.findByEmailId(username);

        log.info("user Details"+UserDetails);

        if(!Objects.isNull(UserDetails)) {
            return new User(UserDetails.getEmail(), UserDetails.getPassword(), new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User Not Found");
        }

    }

    public com.inn.restaurant.models.User getUserDetails(){

        return UserDetails;

    }
}

