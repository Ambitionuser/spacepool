package com.it.Test;

import com.alibaba.fastjson.JSONObject;

/*
* fastjosn语法
*
* */
public class TestJson {
    public static void main(String[] args) {

        //string转json
        String param = "{\"age\":\"24\",\"name\":\"陈延宁\"}";
        JSONObject jsonObject;
        jsonObject = JSONObject.parseObject(param);
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("name"));


        //JsonObject转String
        String jsonString = jsonObject.toJSONString();
        System.out.println(jsonString);


    }
}
