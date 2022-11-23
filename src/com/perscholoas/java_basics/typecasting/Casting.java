package com.perscholoas.java_basics.typecasting;

public class Casting {
    public static void main(String[] args) {
        //1.Implicit Type Casting
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
        System.out.println("1. Implicit Type Casting\n1a. Sum of two numbers: " + z);
        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("1b. Subtraction of two numbers: " + r);
        //2.Automatic Type Promotion
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        // Expression:
        double result = (f * b) + (i / c) - (d * s);
        //Result after all the promotions are done.
        System.out.println("2.Automatic Type Promotion\n2.Result: " + result);
        //3.Explicit Type Casting
        d = 100.04;
        long l = (long)d;
        i = (int)l;
        System.out.println("3.Explicit Type Casting");
        System.out.println("Double value "+d); // fractional part lost.
        System.out.println("Long value "+l); // fractional part lost.
        System.out.println("Int value "+i);
        int z1 = 257;
        double dou = 323.142;
        System.out.println("3a.Conversion of int to byte.");
        b = (byte) z1;
        System.out.println("i = " + z1 + " b = " + b);
        System.out.println("3b.Conversion of double to int.");
        z1 = (int) dou;
        System.out.println("d = " + dou + " b = " + z);
        System.out.println("3c.Conversion of double to byte.");
        b = (byte) dou;
        System.out.println("d = " + dou + " b = " + b);
    }
}
