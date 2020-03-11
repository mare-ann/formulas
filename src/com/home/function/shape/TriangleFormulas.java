package com.home.function.shape;

public class TriangleFormulas {
    public static int square (int a, int b, int c){
        int p = perimeter(a, b, c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
        return p;
    }
    public static int perimeter (int a, int b, int c){
        int p = a + b + c ;
        return p;
    }

}
