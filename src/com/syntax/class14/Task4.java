package com.syntax.class14;

public class Task4 {
    public static void main(String[] args) {

       /* StringBuilder st=new StringBuilder("This is sentence I want to reverse");
        System.out.println(st.reverse());
        String str=st.toString(); // converting StringBuilder to String so that we can call method from String
        */

        String str="This is sentence I want to reverse";
        String [] arr=str.split(" ");

       /* for (String word:arr){
            for (int i = word.length()-1; i >= 0; i--) {
                System.out.print(word.charAt(i));
        }
            System.out.print(" ");
        }*/
        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}
