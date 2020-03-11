package com.home.function.shape;

public class RectangleFormulas {
    public static int square (int a, int b){
        int s=a*b;
        return s;
    }

    public static int perimeter (int a, int b){
        int p=2*(a+b);
        return p;
    }

    public static double diagonal (int a, int b){
        double a2=Math.pow(a,2);
        double b2=Math.pow(b,2);
        double d=Math.sqrt(a2+b2);
        return d;
    }
}
