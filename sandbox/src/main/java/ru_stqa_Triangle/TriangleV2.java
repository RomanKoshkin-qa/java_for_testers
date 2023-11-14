package ru_stqa_Triangle;

public class TriangleV2 {
    double a,b,c;
    //конструктор для класса TriangleV2
    public TriangleV2(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double Perimentr(){ //метод для периметра
        return a+b+c;
    }
    public double Area() {  //метод для площади
        double Per = (this.a + this.b + this.c) / 2;
        return Math.sqrt(Per * (Per - this.a) * (Per - this.b) * (Per - this.c));
    }
    public static void main(String[] args) {
        TriangleV2 ExampleTriangle= new TriangleV2(5.0,6.0,10.0);
        System.out.println(ExampleTriangle.Perimentr());
        System.out.println(ExampleTriangle.Area());
    }
}

