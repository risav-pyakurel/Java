package com.javatuts.tuts.datatypes;

public class Conditions {
    public static void main(String[] args) {
        boolean isSunny = false;
        boolean isWarm = true;

        if(isSunny &&isWarm) {
            System.out.println("It's a beach day");

        }
        else if(isSunny){
            System.out.println("wear a muffler");
        }else{
            System.out.println("not a good day to go outside");
        }

    }

}
