package com.perscholoas.java_basics.operatorlab;

public class Operator {
    public static void main(String[] args){
        //1. Assignment Operators
        //Assigning Primitive Values
        System.out.println("1.Assignment Operators:");
        int j, k;
        j = 10; // j gets the value 10.
        j = 5; // j gets the value 5. The previous value is overwritten.
        k = j; // k gets the value 5.
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
        //Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
        //2.Arithmetic Operators
        System.out.println("\n2.Arithmetic Operators");
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);
        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
        // Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
        // Integer.MAX_VALUE.
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println("4.0 / 0.0 "+4.0 / 0.0); // Prints: Infinity
        System.out.println("-4.0 / 0.0 "+-4.0 / 0.0); // Prints: -Infinity
        System.out.println("0.0 / 0.0 "+0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1 by integer division. d1 gets the value
        // 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 iss " + d2);
        //3.Relational Operators
        System.out.println("\n3.Relational Operators");
        x = 10;
        y = 5;
        System.out.println("x > y : "+(x > y));
        System.out.println("x < y : "+(x < y));
        System.out.println("x >= y : "+(x >= y));
        System.out.println("x <= y : "+(x <= y));
        System.out.println("x == y : "+(x == y));
        System.out.println("x != y : "+(x != y));
        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: "+ (variable1 == variable2));
        System.out.println("variable1 == variable3: "+ (variable1 == variable3));
        //4.Logical Operators
        System.out.println("\n4.Logical Operators");
        boolean x1 = true;
        boolean y1 = false;
        System.out.println("x1 & y1 : " + (x1 & y1));
        System.out.println("x1 && y1 : " + (x1 && y1));
        System.out.println("x1 | y1 : " + (x1 | y1));
        System.out.println("x1 || y1: " + (x1 || y1));
        System.out.println("x1 ^ y1 : " + (x1 ^ y1));
        System.out.println("!x1 : " + (!x1));
        //5.Bitwise Operators
        System.out.println("\n5.Bitwise Operators");
        x = 58; //111010
        y =13; //1101
        System.out.println("x & y : " + (x & y)); //returns 8 = 1000
        System.out.println("x | y : " + (x | y)); //63=111111
        System.out.println("x ^ y : " + (x ^ y)); //55=11011
        System.out.println("~x : " + (~x));  //-59
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));
        //6.Ternary Operators
        System.out.println("\n6.Ternary Operators");
        int age = 18;
        System.out.println("Age is: "+age);
        String result = age < 100 ?"age is Less than 100" : "age is Greater than 100";
        System.out.println(result); //Less than 100
        //7.Unary Operators
        System.out.println("\n6.Unary Operators");
        int sum = +1;
        // sum is now 1
        System.out.println("=+1: "+sum);
        sum--;
        // sum is now 0
        System.out.println("--: "+sum);
        sum++;
        // sum is now 1
        System.out.println("++: "+sum);
        sum = -sum;
        // sum is now -1
        System.out.println("-: "+sum);
        boolean result1 = false;
        // false
        System.out.println("bool: "+result1);
        // true
        System.out.println("!bool: "+!result1);

    }
}
