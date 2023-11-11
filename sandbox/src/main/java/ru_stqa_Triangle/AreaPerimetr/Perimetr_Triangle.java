package ru_stqa_Triangle.AreaPerimetr;

public class Perimetr_Triangle {
    double a,b,c;

    public Perimetr_Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static void printTrianglePerimetr(Perimetr_Triangle s) { //периметр
        String text= String.format("Периметр треульльника со сторонами %f, %f и %f = %f",s.a,s.b,s.c,s.summastoron());
        System.out.println(text);

    }

    public static double summastoron(double a, double b, double c) {
        return a + b + c;
    }

    public double summastoron() {
        return this.a+this.b+this.c;
    }
}
