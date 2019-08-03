package com.it.controller;


import org.junit.Test;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EhcacheController {

//    @Test
//    public void getEhcache(){
//        System.out.println("开始创建缓存");
//        int b=9;
//        int ehcacheTest = getEhcacheTest(b);
//        System.out.println(ehcacheTest);
//
//        System.out.println("第一次使用缓存");
//        int ehcacheTest1 = getEhcacheTest(b);
//        System.out.println(ehcacheTest1);
//    }


    /**
     * value中的值代表缓存的值，与配置文件保持一致
     *
     * key为所传的值作为缓存的键
     * key="#id"
     * key="#p0"
     * key="#user.id"
     * key="#p0.id"
     *
     * 将缓存保存进andCache，并当参数userId的长度小于32时才保存进缓存，默认使用参数值及类型作为缓存的key
     * condition="#userId.length < 32"
     * @return
     */
//    @Cacheable(value ="imoc",key ="#b")
//    public int getEhcacheTest(int b){
//        System.out.println("开始使用缓存");
//        int a=8;
//        int c=a+b;
//        System.out.println("计算结束");
//        return c;
//
//    }
}
