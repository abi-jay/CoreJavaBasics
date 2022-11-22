package com.perscholoas.java_basics.variables;

public class Variables {
    public static void main(String[] args) {
        //1.Integer Sum
        int a = 3;
        int b = 5;
        int sum_int = a + b;
        System.out.println("1.Int Sum\t"+sum_int);
        //2.Double Sum
        double x = 3.59;
        double y = 1.28;
        double sum_double = x+y;
        System.out.println("2.Double Sum\t"+sum_double);
        //3.Int Double sum
        sum_double = a+x;
        System.out.println("3.Int double sum\t"+sum_double);
        //4.Decimal divide
        int divide_int = (a>b)? a/b : b/a;
        System.out.println("4a.Int divide\t"+divide_int);
        double divide_double = (a>b)? (double)a/b : (double)b/a;
        System.out.println("4b.Decimal\t"+divide_double);
        //5.Cast to int
        divide_double = (x>y)? x/y : y/x;
        System.out.println("5a.Double divide\t"+divide_double);
        divide_int = (int)divide_double;
        System.out.println("5b.Cast to int\t"+divide_int);
        //6.Cast to double
        a = 5;
        b = 6;
        int q = b/a;
        System.out.println("6a.Int divide\t"+q);
        double q1 = ((double)b/a);
        System.out.println("6b.Cast to double\t"+q1);
        //7.Constant
        final double RADIUS = 3.35;
        double diameter = 2*RADIUS;
        System.out.println("7.Constant\t"+diameter);
        //8.Total Sales
        double coffee, green_tea, espresso;
        coffee = 3.99;
        green_tea = 2.65;
        espresso = 1.75;
        double totalSale, subTotal;
        subTotal = 3*coffee + 4*green_tea + 2*espresso;
        final double SALES_TAX = 0.30 * subTotal;
        totalSale = subTotal + SALES_TAX;
        System.out.printf("8.Total Sales\t %2f\n",totalSale);
    }
}
