package com.perscholoas.java_basics.operators;

public class Operators {
    public static void main(String[] args){
        //3.Integer and binary notation
        int x = 2;
        System.out.println("3. Binary version of 2:\t"+Integer.toBinaryString(x));
        //3.Left Shift by 1
        System.out.println("3a. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x<<=1;
        //Predicted values: 4 and 100
        System.out.println("3a. After left shift by 1, Integer:\t"+x);
        System.out.println("3a. After left shift by 1, Binary:\t"+Integer.toBinaryString(x));
        x = 9;
        System.out.println("3b. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x<<=1;
        //Predicted values: 18 and 10010
        System.out.println("3b. After left shift by 1, Integer:\t"+x);
        System.out.println("3b. After left shift by 1, Binary:\t"+Integer.toBinaryString(x));
        x = 17;
        System.out.println("3c. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x<<=1;
        //Predicted values: 34 and 100010
        System.out.println("3c. After left shift by 1, Integer:\t"+x);
        System.out.println("3c. After left shift by 1, Binary:\t"+Integer.toBinaryString(x));
        x = 88;
        System.out.println("3d. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x<<=1;
        //Predicted values: 176 and 10110000
        System.out.println("3d. After left shift by 1, Integer:\t"+x);
        System.out.println("3d. After left shift by 1, Binary:\t"+Integer.toBinaryString(x));
        //4.Right Shift by 2
        x = 150;
        System.out.println("4. Binary version of 150:\t"+Integer.toBinaryString(x));
        //4.Right Shift by 2
        System.out.println("4a. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x>>=2;
        //Predicted values: 37 and 100101
        System.out.println("4a. After right shift by 2, Integer:\t"+x);
        System.out.println("4a. After right shift by 2, Binary:\t"+Integer.toBinaryString(x));
        x = 225;
        System.out.println("4b. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x>>=2;
        //Predicted values: 56 and 111000
        System.out.println("4b. After right shift by 2, Integer:\t"+x);
        System.out.println("4b. After right shift by 2, Binary:\t"+Integer.toBinaryString(x));
        x = 1555;
        System.out.println("4c. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x>>=2;
        //Predicted values: 388 and 110000100
        System.out.println("4c. After right shift by 2, Integer:\t"+x);
        System.out.println("4c. After right shift by 2, Binary:\t"+Integer.toBinaryString(x));
        x = 32456;
        System.out.println("4d. Shift operator on \t"+x+"\t"+Integer.toBinaryString(x));
        x>>=2;
        //Predicted values: 8114 and 1111110110010
        System.out.println("4d. After right shift by 2, Integer:\t"+x);
        System.out.println("4d. After right shift by 2, Binary:\t"+Integer.toBinaryString(x));
        //5.Bitwise and Bitwise or
        int y,z;
        x = 7;
        y = 17;
        z = x | y;
        //Predicted values: 23 and 10111
        System.out.println("5a. After Bitwise AND, Integer:\t"+z);
        System.out.println("5a. After Bitwise AND, Binary:\t"+Integer.toBinaryString(z));
        z = x & y;
        //Predicted values: 1 and 1
        System.out.println("5b. After Bitwise OR, Integer:\t"+z);
        System.out.println("5b. After Bitwise OR, Binary:\t"+Integer.toBinaryString(z));
        //6.Postfix Increment
        int num = 20;
        num++;
        System.out.println("6. Posfix increment of 20:\t"+num);
        //7.Ways to increment
        num+=1;
        System.out.println("7a.Increment by +=1:\t"+num);
        num+=1;
        System.out.println("7a.Increment by +=1:\t"+num);
        num+=1;
        System.out.println("7a.Increment by +=1:\t"+num);
        num++;
        System.out.println("7b.Increment by postfix++:\t"+num);
        num++;
        System.out.println("7b.Increment by postfix++:\t"+num);
        num++;
        System.out.println("7b.Increment by postfix++:\t"+num);
        ++num;
        System.out.println("7c.Increment by ++prefix:\t"+num);
        ++num;
        System.out.println("7c.Increment by ++prefix:\t"+num);
        ++num;
        System.out.println("7c.Increment by ++prefix:\t"+num);
        //8.Postfix and Prefix
        x = 5;
        y = 8;
        int sum = ++x +y;
        //Predicted sum 14
        System.out.println("8a.Increment by ++prefix:\t"+sum);
        x = 5;
        y = 8;
        sum = x++ +y;
        //Predicted sum 13
        System.out.println("8a.Increment by postfix++:\t"+sum);



    }
}
