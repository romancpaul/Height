package com.HomeWork1;

// 5

public class Main {

    public static void main(String[] args) {
        int inches = 10;
        int feet = 5;

       double conversion = ((feet * 30.48) + (inches * 2.54));

       double d = conversion;
       int i = (int)d;

        System.out.println("The height is: " + i + " centimeters.");
    }
}
