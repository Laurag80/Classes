package com.syntax.class20;

public class SportTest {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket", "Pakistan", "Green Helmet");
        crick.display();

        Soccer soc=new Soccer("Soccer", "Argentina", "Oliver's",12);
        soc.display();
        soc.displayTeam();

    }
}
