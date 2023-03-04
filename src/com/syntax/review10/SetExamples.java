package com.syntax.review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {


       Set<String> qaJobs= new HashSet<>();
        // adding object/element to the collection
       qaJobs.add("Automation Engineer");
       qaJobs.add("Manual Tester");
       qaJobs.add("SDET");
       qaJobs.add("QA Analyst");
       qaJobs.add("Api Tester");
       qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Remove an elements "+qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");

        System.out.println("Added duplicates "+qaJobs);
        // create an Object and passing collection as a parametrized contructor
        Set lset=new LinkedHashSet(qaJobs);

        System.out.println("linkedHashset ="+lset);
    }
}
