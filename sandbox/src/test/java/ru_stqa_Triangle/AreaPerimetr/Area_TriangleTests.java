package ru_stqa_Triangle.AreaPerimetr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Area_TriangleTests {
    @Test
    void canCalculateArea(){
        Assertions.assertEquals(6.0,new Area_Triangle(3.0,4.0,5.0).formulaGeron());
    }
}
