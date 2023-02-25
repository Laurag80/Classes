package com.syntax.class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> subject=new LinkedList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Jira");
        subject.add("GIT");
        subject.add("Java");

        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjectList=new LinkedList<>();
        allSubjectList.addAll(subject);
        allSubjectList.addAll(futureSubjects);
        System.out.println(allSubjectList);

        allSubjectList.removeAll(futureSubjects);
        System.out.println(allSubjectList);
    }
}
