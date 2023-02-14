package com.syntax.class24;

    /*
    create a phone class lets create abstruct method like displayPictures unlockPhone
    SendTxt
    2. child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract class Phone {
        public abstract void displayPictures();
        public abstract void unlockPhone();
        public abstract void sendTxt();
    }

    class Iphone extends Phone {
        public void displayPictures() {
            System.out.println("Displaying pictures on an iPhone");
        }
        public void unlockPhone() {
            System.out.println("Unlocking an iPhone with Face ID or passcode");
        }
        public void sendTxt() {
            System.out.println("Sending a text message from an iPhone");
        }
    }

    class Samsung extends Phone {
        public void displayPictures() {
            System.out.println("Displaying pictures on a Samsung phone");
        }
        public void unlockPhone() {
            System.out.println("Unlocking a Samsung phone with fingerprint or passcode");
        }
        public void sendTxt() {
            System.out.println("Sending a text message from a Samsung phone");
        }
    }

    class Google extends Phone {
        public void displayPictures() {
            System.out.println("Displaying pictures on a Google phone");
        }
        public void unlockPhone() {
            System.out.println("Unlocking a Google phone with face recognition or pattern");
        }
        public void sendTxt() {
            System.out.println("Sending a text message from a Google phone");
        }
}
