package javacollection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        //list
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("1");
        arrayList.add("2");
        for (Object key:arrayList) {
            String value= (String) key;
            System.out.println(value);
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        Iterator<Object> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("chen");
        hashSet.add("ning");

        System.out.println(hashSet);
        for (String value:hashSet
             ) {
            System.out.println(value);
        }
        Iterator<String> hashsetvalue = hashSet.iterator();
        while (hashsetvalue.hasNext()){
            String next = hashsetvalue.next();
            System.out.println(next);
        }


        //map
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("1","chen");
        hashMap.put("2","yan");
        hashMap.put("3","ning");

        for (String key:hashMap.keySet()) {
            Object value = hashMap.get(key);
            System.out.println(key+"="+value);
        }
        for (Map.Entry<String,Object> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Object>> map = entries.iterator();
        while (map.hasNext()){
            String key = map.next().getKey();
            Object value = hashMap.get(key);
            System.out.println(key+"========"+value);
        }
        for (Map.Entry<String, Object> key:entries) {
            String key1 = key.getKey();
            Object value = hashMap.get(key1);
            System.out.println(key1+"======"+value);
        }




    }
}
