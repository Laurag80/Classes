package com.syntax.class22;

public class Employee {

    String name;

  static  int baseSalary=3000;
   static int baseHolidays=10;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}
class OfficeBoys extends Employee{

}
class Manager extends Employee{
    void  printSalary(){
        System.out.println((baseSalary*4)+200000);
    }
}
class Developer extends  Employee{
    void printSalary(){
        System.out.println((baseSalary*5)+300000);
    }
}
class QA extends  Employee{
    void printSalary(){
        System.out.println((baseSalary*2)+3000000);
    }
    void  printHolidays(){
        System.out.println(baseHolidays+5);
    }
}
