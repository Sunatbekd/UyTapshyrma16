package com.company;

public class Circle {
   private static final double PI=Math.PI;
    public Circle() {
    }


    public static void area(int radius){
        double s = PI * (radius * radius);
        System.out.println(s);
    }
    public static void circumference (int radius){
        double s1 = PI * 2 * radius;
        System.out.println(s1);

    }
}
