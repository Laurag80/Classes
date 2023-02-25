package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

       // numbers.removeIf(x-> x>11); // Lambda expression
        System.out.println(numbers);

        Iterator<Double> iterator=numbers.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(numbers);
        while (iterator.hasNext()) {
            // hasNex() keeps on running true as lon as there are elements left to be iterated

            double number = iterator.next();
            if (number > 11) {
                iterator.remove();
            }
        }
       /* numbers.remove(40.5);
        System.out.println(numbers);

        for (Double number:numbers){
            if (number<11){
                numbers.remove(numbers);
            }
            System.out.println(number);
        }*/
    }
}

