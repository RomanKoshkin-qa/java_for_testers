package ru_stqa_Triangle.AreaPerimetr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Perimetr_TriangleTests {
    @Test
    void canCalculatePerimetr(){
        Assertions.assertEquals(15.0,new Perimetr_Triangle(4.0,5.0,6.0).summastoron());
    }
}
