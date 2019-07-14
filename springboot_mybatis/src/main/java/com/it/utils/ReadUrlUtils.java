package com.it.utils;


import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadUrlUtils {
    private static final Logger logger = LoggerFactory.getLogger(ReadUrlUtils.class);
    public String readJsonFromUrl(String ecmdburl) {
        StringBuffer stringBuffer = null;
        BufferedReader reader=null;
        try {
            URL url = new URL(ecmdburl);
            URLConnection connection = null;
            connection = url.openConnection();
            connection.setRequestProperty("Charset","utf-8");
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.connect();
            stringBuffer = new StringBuffer();
            //bufferedreader需要关闭流
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            while ((lines=reader.readLine()) !=null){
                stringBuffer.append(lines);
            }
            logger.info(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader !=null) {
                    reader.close();
                }
             } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return stringBuffer.toString();
    }


}
