package com.it.controller;


import com.it.domain.EsUser;
import com.it.service.EsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EsController {

    @Resource
    EsService esService;

    @RequestMapping("es")
    public void save(){
        EsUser esUser = new EsUser();
        esUser.setId("1");
        esUser.setName("chen");
        esUser.setAge(30);
        esService.save(esUser);
    }

}
