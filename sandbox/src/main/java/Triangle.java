public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimetr() {
        return this.a + this.b + this.c;
    }

    public double getArea() {
        double Per = (this.a + this.b + this.c) / 2;
        return Math.sqrt(Per * (Per - this.a) * (Per - this.b) * (Per - this.c));
    }
}