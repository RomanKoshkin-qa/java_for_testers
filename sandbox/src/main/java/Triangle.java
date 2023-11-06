public class Triangle { //класс
    //int a=5,b=6,c=10; //a+b>c a+c>b b+c>a
    public static void main(String[] args) {
    perimetr(5.0,6.0,10.0);
    area(5.0,6.0,10.0);
    }



    private static void perimetr(double a, double b, double c) { //периметр
        System.out.println("Периметр треульльника со сторонами " +a+" , "+b+" и "+c+" = "+ summastoron(a,b,c));

    }

    private static double summastoron(double a, double b, double c) {
        return a+b+c;
    }
    private static void area(double a, double b, double c) { //площадь
        System.out.println("Площадь треульльника со сторонами " +a+" , "+b+" и "+c+" = "+ formulaGeron(a,b,c));
    }

    private static double formulaGeron(double a, double b, double c) {
        double Per=(a+b+c)/2;
        return Math.sqrt(Per*(Per-a)*(Per-b)*(Per-c));
    }


}

