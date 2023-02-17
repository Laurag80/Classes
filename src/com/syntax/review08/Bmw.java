package com.syntax.review08;

import com.syntax.review07.Car;

public class Bmw extends Car {

    Bmw(String make, String model){
        super(make, model);
    }
    public void start(){
        System.out.println(make+" starts with push button");
    }
    public String drive(String typeOfDriving){
        System.out.println(make+" drive "+typeOfDriving);
        return  typeOfDriving;
    }
    void brake(){
        System.out.println(make+" brakes");
    }
}
