package ru_stqa_Triangle.AreaPerimetr;

public class Area_Triangle {
    double a,b,c;

    public Area_Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static void printTriangleArea(Area_Triangle s) { //площадь
        String text= String.format("Площадь треугольника со сторонами %f, %f и %f = %f",s.a,s.b,s.c,s.formulaGeron());
        System.out.println(text);
    }

    public static double formulaGeron(double a, double b, double c) {
        double Per = (a + b + c) / 2;
        return Math.sqrt(Per * (Per - a) * (Per - b) * (Per - c));
    }

    public double formulaGeron() {
        double Per = (this.a + this.b + this.c) / 2;
        return Math.sqrt(Per * (Per - this.a) * (Per - this.b) * (Per - this.c));
    }
}
