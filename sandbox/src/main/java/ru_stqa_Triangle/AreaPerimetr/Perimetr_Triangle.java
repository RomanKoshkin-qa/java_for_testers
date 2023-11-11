package ru_stqa_Triangle.AreaPerimetr;

public class Perimetr_Triangle {
    public static void printTrianglePerimetr(double a, double b, double c) { //периметр
        String text= String.format("Периметр треульльника со сторонами %f, %f и %f = %f",a,b,c,summastoron(a, b, c));
        System.out.println(text);

    }

    private static double summastoron(double a, double b, double c) {
        return a + b + c;
    }
}
