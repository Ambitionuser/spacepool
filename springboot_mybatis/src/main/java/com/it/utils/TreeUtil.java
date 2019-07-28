package com.it.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class TreeUtil {
    public static void main(String[] args) {
        List<HashMap<String,Object>> list = new ArrayList<>();
        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("name","resourcepool");
        hashMap1.put("type","ResourcePool");
        hashMap1.put("pname","");
        hashMap1.put("ptype","");
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("name","cluster1");
        hashMap2.put("type","Cluster");
        hashMap2.put("ptype","Azone");
        hashMap2.put("pname","azone1");
        HashMap<String, Object> hashMap3 = new HashMap<>();
        hashMap3.put("name","cluster1");
        hashMap3.put("type","Cluster");
        hashMap3.put("ptype","Azone");
        hashMap3.put("pname","azone2");
        HashMap<String, Object> hashMap4 = new HashMap<>();
        hashMap4.put("name","phy1");
        hashMap4.put("type","PhysicalHost");
        hashMap4.put("ptype","Cluster");
        hashMap4.put("pname","cluster1");
        list.add(hashMap1);
        list.add(hashMap2);
        list.add(hashMap3);
        list.add(hashMap4);
        List<HashMap<String, Object>> item = new TreeUtil().getItem(list);
        System.out.println(item);


    }


    public List<HashMap<String,Object>> getItem(List<HashMap<String,Object>> list){
        //构造上下级
        List<HashMap<String,Object>> list2 = new ArrayList<>();
        list2.addAll(list);
        for (int i = 0; i <list.size() ; i++) {
            HashMap<String, Object> map = list.get(i);
            Object name = map.get("name");
            Object pname = map.get("pname");
            Object ptype = map.get("ptype");
            int sum = 0;
            for (int j = 0; j <list.size() ; j++) {
                HashMap<String, Object> map1 = list.get(j);
                Object name1 = map1.get("name");
                Object type1 = map1.get("type");
                if (pname.equals(name1) && ptype.equals(type1)){
                    ++sum;
                }
            }
            if (sum>1){
                for (int j = 1; j <sum ; j++) {
                    HashMap<String, Object> clone = (HashMap<String, Object>) map.clone();
                    list2.add(clone);
                }

            }
        }
        //添加主键 item_id
        List<HashMap<String,Object>> list3 = new ArrayList<>();
        List<HashMap<String,Object>> list4 = new ArrayList<>();
        int id = 0;
        for (int i = 0; i <list2.size() ; i++) {
            HashMap<String, Object> hashMapvalue = list2.get(i);
            ++id;
            hashMapvalue.put("item_id",id);
            list3.add(hashMapvalue);
            list4.add(hashMapvalue);
        }
        //添加父级的pnode
        List<HashMap<String,Object>> list5 = new ArrayList<>();
        for (int i = 0; i <list3.size() ; i++) {
            HashMap<String, Object> objectHashMap = list3.get(i);
            Object pname = objectHashMap.get("pname");
            if (pname!=null && pname !=""){
                for (int j = 0; j <list4.size() ; j++) {
                    Object name = list4.get(j).get("name");
                    Object item_id = list4.get(j).get("item_id");
                    if (pname.equals(name)){
                        objectHashMap.put("pnode",item_id);
                        list4.remove(j);
                        list5.add(objectHashMap);
                    }
                }
                if (objectHashMap.get("pnode")=="" || objectHashMap.get("pnode")==null){
                    objectHashMap.put("pnode",0);
                    list5.add(objectHashMap);
                }
            }else{
                objectHashMap.put("pnode",0);
                list5.add(objectHashMap);
            }
        }
        return list5;
    }



}
