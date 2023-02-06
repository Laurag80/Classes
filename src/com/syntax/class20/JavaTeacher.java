package com.syntax.class20;

public class JavaTeacher {
    private String teacherName;
    private String teacherId;

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {

        JavaTeacher java=new JavaTeacher();

        java.teacherName="Asel";
        java.teacherId="A67";

        java.homework(); //public
        java.grade(); // protected
        java.scholarship(); //default
        //java.extraPoint(); //private members (variable and methods) DO NOT Participate in the Inheritance
    }

    private void scholarship() {
    }

    private void grade() {
    }

    public void homework() {
    }
}
