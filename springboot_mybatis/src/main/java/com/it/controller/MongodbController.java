package com.it.controller;


import com.it.domain.MongodbUser;
import com.it.service.MongodbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MongodbController {
    @Resource
    MongodbService mongodbService;


    @GetMapping("/userlist")
    public List<MongodbUser> findAll(){
        List<MongodbUser> mongodbUsers = mongodbService.findAll();
        return mongodbUsers;
    }

    @RequestMapping(value = "/save")
    public String doSave() {
        MongodbUser mongodbUser = new MongodbUser();
        mongodbUser.setId("2");
        mongodbUser.setName("chenyanning");
        mongodbUser.setAge(30);
        mongodbService.save(mongodbUser);
        return "success";
    }

}
