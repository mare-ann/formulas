package com.home.function.shape;

public class CircleFormulas {

    public static double square(double r) {
        double r2 = Math.pow(r, 2);
        double s = Math.PI * r2;
        return s;
    }

    public static double perimeter (double r){
        double c = 2*Math.PI*r;
        return c;
    }
}
