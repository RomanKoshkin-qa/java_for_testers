package ru_stqa_Triangle;

import ru_stqa_Triangle.AreaPerimetr.Area_Triangle;
import ru_stqa_Triangle.AreaPerimetr.Perimetr_Triangle;

public class Triangle { //класс
    //int a=5,b=6,c=10; //a+b>c a+c>b b+c>a
    public static void main(String[] args) {
        Perimetr_Triangle.printTrianglePerimetr(new Perimetr_Triangle(5.0, 6.0, 10.0));
        Area_Triangle.printTriangleArea(new Area_Triangle(5.0, 6.0, 10.0));
    }


}

