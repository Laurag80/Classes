package com.syntax.review08;

import com.syntax.review07.Car;
import com.syntax.review07.Tesla;

public class CarTest {
    public static void main(String[] args) {

        Bmw bmw=new Bmw("Bmw","X7");
        bmw.start();;
        System.out.println(bmw.drive("somooth"));
        bmw.brake(); // comes from bmw which is subclass

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S",2022,350,"electric",true);
        tesla.start();
        tesla.drive(85);
        tesla.haveAutopilot();

        Car bmw1=new Car("Bmw","X77");
        bmw.start();
        bmw.drive(100);
        bmw.drive("Miami",120);
    }
}
