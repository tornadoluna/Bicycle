package com.company;

public class CycleTester extends Cycle  {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.brake();
        c.start();
        c.changeGear();
    }

}