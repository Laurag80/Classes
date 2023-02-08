package com.syntax.class14;

public class MathTester {
    public String teacherName;

    public static void main(String[] args) {

        Math math=new Math();
        math.add(10,10);

        math.mult(10,2,3);

        int results= math.sub(100,50);
        System.out.println(results);
    }
}
