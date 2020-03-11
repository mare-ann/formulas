package com.home.function.shape;

public class ParallelogramsFormulas {
    public static double square(int a, int b, int angleInDegree) {
        double angleInRadian = Math.toRadians(angleInDegree);
        double sin = Math.sin(angleInRadian);
        double s = a*b*sin;
        return s;
    }

    public static int perimeter (int a, int b){
        int p=2*(a+b);
        return p;
    }

    public static double diagonalOne (int a, int b, int angleInDegree){
        double angleInRadian = Math.toRadians(angleInDegree);
        double cos = Math.cos(angleInRadian);
        double a2=Math.pow(a,2);
        double b2=Math.pow(b,2);
        double d1=Math.sqrt(a2+b2-2*a*b*cos);
        return d1;
    }

    public static double diagonalTwo (int a, int b, int angleInDegree){
        double angleInRadian = Math.toRadians(angleInDegree);
        double cos = Math.cos(angleInRadian);
        double a2=Math.pow(a,2);
        double b2=Math.pow(b,2);
        double d2=Math.sqrt(a2+b2+2*a*b*cos);
        return d2;
    }
}
