package com.syntax.class19;

public class ThisKeyword {

    int a, b;

    ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }
    void hello(){
        System.out.println("hello Batch15");
    }
    void hoAreYou(){
        System.out.println("how are you batch15?");
    }
    void greetings(){
        hello();
        hoAreYou();
    }

    public static void main(String[] args) {
       ThisKeyword obj=new ThisKeyword(10,20);
       obj.sum(100,200);
        System.out.println(obj.a);
        //------------------------------------------
        obj.greetings();
    }
}