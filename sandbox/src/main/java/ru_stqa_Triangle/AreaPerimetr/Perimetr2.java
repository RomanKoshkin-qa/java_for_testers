package ru_stqa_Triangle.AreaPerimetr;

public class Perimetr2 {
    double a;
    double b;
    double c;
    public static void printTrianglePerimetr(Perimetr_Triangle s) { //периметр
        String text= String.format("Периметр треульльника со сторонами %f, %f и %f = %f",s.a,s.b,s.c,s.summastoron());
        System.out.println(text);

    }

    public double summastoron() {
        return this.a+this.b+this.c;
    }
}
