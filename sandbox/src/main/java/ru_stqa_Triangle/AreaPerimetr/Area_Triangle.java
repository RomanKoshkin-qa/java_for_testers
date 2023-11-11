package ru_stqa_Triangle.AreaPerimetr;

public class Area_Triangle {
    public static void printTriangleArea(double a, double b, double c) { //площадь
        String text= String.format("Площадь треульльника со сторонами %f, %f и %f = %f",a,b,c,formulaGeron(a, b, c));
        System.out.println(text);
    }

    private static double formulaGeron(double a, double b, double c) {
        double Per = (a + b + c) / 2;
        return Math.sqrt(Per * (Per - a) * (Per - b) * (Per - c));
    }
}
