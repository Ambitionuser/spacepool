package com.it.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControlller {



    @RequestMapping(value = "/test")
    public String findUserName(){
        return "nihaafsdao1";
    }
}
