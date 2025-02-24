package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testCircle() {
        Circle myCircle = new Circle(7.0);
        Assertions.assertEquals(153.9380, myCircle.computeArea(), 0.0001);
        Assertions.assertEquals(43.9823, myCircle.computePerimeter(), 0.0001);
    }
    @Test
    public void testRectangle() {
        Rectangle myRectangle = new Rectangle(6.0, 9.0);
        Assertions.assertEquals(54.0, myRectangle.computeArea(), 0.0001);
        Assertions.assertEquals(30.0, myRectangle.computePerimeter(), 0.0001);
        Assertions.assertEquals(4, myRectangle.getSides());
    }
    @Test
    public void testSquare() {
        Square mySquare = new Square(8.0);
        Assertions.assertEquals(64.0, mySquare.computeArea(), 0.0001);
        Assertions.assertEquals(32.0, mySquare.computePerimeter(), 0.0001);
        Assertions.assertEquals(4, mySquare.getSides());
    }
    @Test
    public void testRightTriangle() {
        RightTriangle myTriangle = new RightTriangle(9.0, 12.0);
        Assertions.assertEquals(54.0, myTriangle.computeArea(), 0.0001);
        Assertions.assertEquals(33.0, myTriangle.computePerimeter(), 0.0001);
        Assertions.assertEquals(3, myTriangle.getSides());
    }
    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle myIsoTriangle = new IsoscelesRightTriangle(8.0);
        Assertions.assertEquals(32.0, myIsoTriangle.computeArea(), 0.0001);
        double expected = 16.0 + Math.sqrt(128.0);
        Assertions.assertEquals(expected, myIsoTriangle.computePerimeter(), 0.0001);
        Assertions.assertEquals(3, myIsoTriangle.getSides());
    }
}
