package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        // Convert the list to a set to remove duplicates
        Set<String> set = new HashSet<>(aList);

        // Convert the set back to a list
        List<String> newList = new ArrayList<>(set);

        // Print the new list without duplicates
        System.out.println(newList);
    }
}
