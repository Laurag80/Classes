package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> stringMap=new HashMap<>();

        stringMap.put(1,"Nazir");
        stringMap.put(2,"Anush");
        stringMap.put(3,"Tami");
        stringMap.put(4,"Aisha");

        System.out.println(stringMap);
        System.out.println(stringMap.get(3));
        System.out.println(stringMap.size());
        System.out.println(stringMap.containsKey(5));
        System.out.println(stringMap.containsValue("Aisha"));
        System.out.println(stringMap.remove(1));
        System.out.println(stringMap);
        stringMap.replace(2,"Asli");
        System.out.println(stringMap);
    }
}
