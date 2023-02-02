package HomeWork10;

public class Student {
    /*
    2)Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    int testing;
    int java;
    int git;

    Student(String studentName,int gradeTesting,int gradeJava,int gradeGit){
        name=studentName;
        testing=gradeTesting;
        java=gradeJava;
        git=gradeGit;


    }
    void print() {
        int Average = (testing + java + git) / 3;
        System.out.println(name+"'s "+"Average is " +Average);

    }
}
