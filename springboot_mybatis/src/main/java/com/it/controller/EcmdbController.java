package com.it.controller;

import com.it.constant.LogggerConstant;
import com.it.domain.MmsInter;
import com.it.service.EcmdbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EcmdbController {
    private static final Logger logger = LoggerFactory.getLogger(LogggerConstant.class);
    @Resource
    EcmdbService ecmdbService;


    @RequestMapping(value="updateInterList/{id}/{value}/{resultcode}")
    public void updateInterList(@PathVariable int id,@PathVariable String value,@PathVariable String resultcode){
        MmsInter mmsInter = new MmsInter();
        mmsInter.setId(id);
        mmsInter.setValue(value);
        mmsInter.setResultcode(resultcode);
        ecmdbService.updateInterList(mmsInter);
    }

}
