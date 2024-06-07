package com.bosch.example.controllers;
import com.bosch.example.sto.User;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test(@RequestBody User user) {
        
        if(user.name() == null) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "name is missing."
            );
        if(user.name().matches("[A-Z a-z Çç]" )
           
        }
        return user.name();
    }
}