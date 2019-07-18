package com.it.controller;

import com.alibaba.fastjson.JSONArray;
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

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public String getMmsList(@PathVariable String id){
        List<MmsType> mmsTypeList = mmsTypeService.getMmsTypeList(id);
        String json = JSONArray.toJSONString(mmsTypeList);
        return json;
    }
}
