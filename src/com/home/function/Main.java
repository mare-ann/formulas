package com.home.function;

import com.home.function.shape.RectangleFormulas;
import com.home.function.shape.TriangleFormulas;
import com.home.function.shape.CircleFormulas;
import com.home.function.shape.SquareFormulas;
import com.home.function.shape.ParallelogramsFormulas;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

    private static DecimalFormat df2 = new DecimalFormat("#.#");

    public static void main(String[] args) {
        System.out.println("Hello!");
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println(" 1 - Rectangle ");
        System.out.println(" 2 - Square ");
        System.out.println(" 3 - Circle ");
        System.out.println(" 4 - Parallelogram ");
        System.out.println(" 5 - Triangle ");
        int number = scanner.nextInt();
        if (number == 1){
            rectangleCalculate();
        }else if (number == 2){
            squareCalculate();
        }else if (number == 3){
            circleCalculate();
        }else if (number == 4){
            parallelogramsCalculate();
        }else if (number == 5){
            triangleCalculate();
        } else {
            System.out.println("Yors number not correct");
        }

    }

    private static void rectangleCalculate (){
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println("Enter rectangle a side:");
        int a = scanner.nextInt();
        System.out.println("Enter rectangle b side:");
        int b = scanner.nextInt();
        int s = RectangleFormulas.square(a,b);
        int p = RectangleFormulas.perimeter(a,b);
        double d = RectangleFormulas.diagonal(a,b);
        System.out.println("Square s ="+ s);
        System.out.println("Perimeter p ="+ p);
        System.out.println("Diagonally d ="+ d);
        System.out.println("Diagonally d = " + df2.format(d));
    }

    private static void squareCalculate (){
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println("Enter square a side:");
        int a = scanner.nextInt();
        int s = SquareFormulas.square(a);
        int p = SquareFormulas.perimeter(a);
        double d = SquareFormulas.diagonal(a);
        System.out.println("Square s ="+ s);
        System.out.println("Perimeter p ="+ p);
        System.out.println("Diagonally d = " + df2.format(d));
    }

    private static void circleCalculate (){
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println("Enter circle r side:");
        double r = scanner.nextDouble();
        double s = CircleFormulas.square(r);
        double c = CircleFormulas.perimeter(r);
        System.out.println("Circle s ="+ df2.format (s));
        System.out.println("Perimeter c ="+ df2.format(c));
    }

    private static void parallelogramsCalculate (){
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println("Enter parallelogram a side:");
        int a = scanner.nextInt();
        System.out.println("Enter parallelogram b side:");
        int b = scanner.nextInt();
        System.out.println("Enter parallelogram angle side:");
        int angle = scanner.nextInt();
        double s = ParallelogramsFormulas.square(a, b, angle);
        int p = ParallelogramsFormulas.perimeter(a, b);
        double d1 = ParallelogramsFormulas.diagonalOne(a, b, angle);
        double d2 = ParallelogramsFormulas.diagonalTwo(a, b, angle);
        System.out.println("Square s ="+  df2.format(s));
        System.out.println("Perimeter p ="+ p);
        System.out.println("Diagonally d1 ="+ df2.format(d1));
        System.out.println("Diagonally d2 = " + df2.format(d2));
    }

    private static void triangleCalculate (){
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        System.out.println("Enter triangle a side:");
        int a = scanner.nextInt();
        System.out.println("Enter triangle b side:");
        int b = scanner.nextInt();
        System.out.println("Enter triangle c side:");
        int c = scanner.nextInt();
        double s = TriangleFormulas.square(a, b, c);
        int p = TriangleFormulas.perimeter(a, b, c);
        System.out.println("Circle s ="+ df2.format (s));
        System.out.println("Perimeter c ="+ p);
    }
}
