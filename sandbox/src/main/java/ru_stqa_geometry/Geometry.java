package ru_stqa_geometry;

import ru_stqa_geometry.figures.Rectangle;
import ru_stqa_geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0);
        Square.printSquareArea(5.0);
        Square.printSquareArea(3.0);

        Rectangle.printRectangleArea(3.0,5.0);
        Rectangle.printRectangleArea(7.0,9.0);
    }

}
