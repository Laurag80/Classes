package com.syntax.class28;

import com.syntax.class26.Dog;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {

        // ArrayList<String> name=new ArrayList<>();

        ArrayList name=new ArrayList();
        name.add("Eshan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknown"));

        for(Object j:name){
            System.out.println(j);
        }
    }
}
