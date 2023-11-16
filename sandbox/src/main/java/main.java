public class main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 6.0, 10.0);

        double var10001 = triangle.getPerimetr();
        double var10002 = triangle.getArea();
        System.out.print("Периметр треугольника со сторонами "+triangle.a+" "+triangle.b+" "+triangle.c+" равен ");
        System.out.println(var10001);
        System.out.print("Площадь треугольника со сторонами "+triangle.a+" "+triangle.b+" "+triangle.c+" равна ");
        System.out.println(var10002);

    }
}
