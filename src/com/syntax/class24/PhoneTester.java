package com.syntax.class24;

public class PhoneTester {

    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Iphone();
        phones[1] = new Samsung();
        phones[2] = new Google();

        for (Phone phone : phones) {
            phone.displayPictures();
            phone.unlockPhone();
            phone.sendTxt();
            System.out.println();
        }
    }
}
