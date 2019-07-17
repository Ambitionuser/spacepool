package com.it.controller;

import com.it.domain.MmsInter;
import com.it.service.EcmdbService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class EcmdbBatch {
    @Resource
    EcmdbService ecmdbService;

    public static void main(String[] args) {
        new EcmdbBatch().ecmdbInterList();
    }

    public void ecmdbInterList(){
        MmsInter mmsInter1 = new MmsInter();
        mmsInter1.setId(2);
        mmsInter1.setValue("a");
        mmsInter1.setResultcode("aa");
        MmsInter mmsInter2 = new MmsInter();
        mmsInter2.setId(3);
        mmsInter2.setValue("b");
        mmsInter2.setResultcode("bb");
        List<MmsInter> list = new ArrayList<>();
        list.add(mmsInter1);
//        list.add(mmsInter2);
        System.out.println(list);
        ecmdbService.ecmdbInterList(list);
    }
}
