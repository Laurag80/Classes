package com.syntax.review09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List<String> computer=new ArrayList<>();
        computer.add("MacBook pro");
        computer.add("HP");
        computer.add("Lenovo");
        computer.add("Dell");

        System.out.println(computer);

        for( int i=0; i<computer.size(); i++){
            computer.get(i);
            String c=computer.get(i);
            System.out.println(c+" ");
        }
    }
}
