package ru_stqa_geometry.figures;

public class Rectangle {
    double a,b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public static void printRectangleArea(Rectangle s) {
        var text= String.format("Площадь прямоугольника со сторонами %f и %f = %f",s.a,s.b,s.RectangleArea());
        System.out.println(text);
    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }
    public double RectangleArea(){
        return this.a*this.b;
    }
}
