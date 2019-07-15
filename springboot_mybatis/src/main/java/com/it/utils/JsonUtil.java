package com.it.utils;

import java.util.HashMap;
import java.util.Map;

public class JsonUtil {
    HashMap<String,Object> resultMap=new HashMap<String,Object>();
    //递归
    public HashMap<String,Object> paresJsonToMap(Map<String,Object> params){
        for (Map.Entry<String,Object> entry:params.entrySet()) {
            Object valueObj = entry.getValue();
            if(valueObj instanceof Map){
                paresJsonToMap((Map<String,Object>) valueObj);
            }else{
                resultMap.put(entry.getKey(),valueObj);
            }
        }
            return resultMap;
    }
}
