package com.syntax.class27;

public class Demo2 {

    public static void main(String[] args) {

        String name="Urwa";
        String[] names={"Hiral", "Nima", "Laura", "Nat"};
        // create a method which can search a name from this array return if name is present in the array
        System.out.println(contains(name,names));
        String[] arr=new String[2];
        names[4]="Shah";
    }
    public static boolean contains(String nameTobeSearched, String[] names){
        for(String name:names){
            if (nameTobeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }
}
