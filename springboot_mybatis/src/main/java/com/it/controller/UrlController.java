package com.it.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.it.utils.ReadUrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
    private static final Logger logger = LoggerFactory.getLogger(UrlController.class);


    @RequestMapping(value="json")
    public String getJson(){
        String str = new ReadUrlUtils().readJsonFromUrl("http://localhost:8080/1");
        str=str.replace("[", "");
        str=str.replace("]", "");
        logger.info("=================="+str);

        //String转json，返回json的对象
        JSONObject obj = JSONObject.parseObject(str);
        System.out.println("obj的json格式"+obj);
        String name1 = obj.getString("name");
        System.out.println(name1);

        //json转string
        String toJSONString = obj.toJSONString();
        System.out.println(toJSONString);
        return toJSONString;
    }
}
