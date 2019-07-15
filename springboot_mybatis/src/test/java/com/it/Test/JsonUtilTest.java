package com.it.Test;

import com.alibaba.fastjson.JSONObject;
import com.it.utils.JsonUtil;

import java.util.HashMap;
import java.util.Map;

public class JsonUtilTest {
    public static void main(String[] args) {
        String jsonStr="{\"842\":{\"useranswer\":\"3407|3408\",\"score1\":0},\"846\":{\"useranswer\":\"3414\",\"score2\":0},\"847\":{\"useranswer\":\"3499\",\"score3\":2}}";
        //json转map
        Map<String,Object> jsonObject = (Map<String, Object>) JSONObject.parse(jsonStr);
        System.out.println(jsonObject);
        HashMap<String, Object> jsonToMap = new JsonUtil().paresJsonToMap(jsonObject);
        System.out.println(jsonToMap);




    }
}
