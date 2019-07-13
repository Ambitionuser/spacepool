package com.it.controller;

import com.it.domain.MmsType;
import com.it.service.MmsTypeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MmsTypeController {

    @Resource
    MmsTypeService mmsTypeService;


    @RequestMapping("/{id}")
    public List<MmsType> getMmsList(@PathVariable String id){
        List<MmsType> mmsTypeList = mmsTypeService.getMmsTypeList(id);

        return mmsTypeList;
    }
}
