package com.it.controller;

import com.it.domain.MmsInter;
import com.it.service.EcmdbService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EcmdbController {
    @Resource
    EcmdbService ecmdbService;

    /**
     * 插入更新数据
     * @param id
     * @param value
     * @param resultcode
     */
    @RequestMapping(value="updateInterList/{id}/{value}/{resultcode}")
    public void updateInterList(@PathVariable String id,@PathVariable String value,@PathVariable String resultcode){
        MmsInter mmsInter = new MmsInter();
        mmsInter.setId(id);
        mmsInter.setValue(value);
        mmsInter.setResultcode(resultcode);
        ecmdbService.updateInterList(mmsInter);
    }

}
