package com.home.function.shape;

public class SquareFormulas {
        public static int square (int a){
            int s = RectangleFormulas.square(a,a);
            return s;
        }

        public static int perimeter (int a){
            int p = RectangleFormulas.perimeter(a,a);
            return p;
        }

        public static double diagonal (int a){
            double d = RectangleFormulas.diagonal(a,a);
            return d;
        }

}
