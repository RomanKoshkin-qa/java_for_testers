public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);
    }
    static void printSquareArea(double side){
        System.out.println("Площадь квадрата со стороной " + side + " = "+ squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
