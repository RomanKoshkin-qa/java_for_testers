import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class TriangleTest {
    Triangle triangle = new Triangle(3.0, 4.0, 6.0);
    Triangle triangle2 = new Triangle(5.0, 6.0, 10.0);

    @Test
    void getPerimetr() {
        Assertions.assertEquals(this.triangle.getPerimetr(), 13.0);
    }

    @Test
    void getArea() {
        Assertions.assertEquals(this.triangle2.getArea(), 11.399013115177997);
    }
}