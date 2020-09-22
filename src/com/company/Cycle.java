package com.company;

public class Cycle implements Bicycle {

    public void changeGear() {
        System.out.println(("gear changed"));
    }


    public void brake() {

        System.out.println("braked");
    }


    public void start() {
        System.out.println("started");

    }

}