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
    public List<MongodbUser> selectUserList(){
        List<MongodbUser> mongodbUsers = mongodbService.selectUserAllList();
        return mongodbUsers;
    }

    @RequestMapping(value = "/save")
    public String doSave() {
        MongodbUser user = new MongodbUser();
        user.setName("chenyanning");
        user.setAge(30);
        mongodbService.saveUser(user);
        return "success";
    }

}
