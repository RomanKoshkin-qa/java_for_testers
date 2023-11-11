package ru_stqa_geometry;

import ru_stqa_geometry.figures.Rectangle;
import ru_stqa_geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(new Rectangle(3.0,5.0));
        Rectangle.printRectangleArea(new Rectangle(7.0,9.0));
    }

}
