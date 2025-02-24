package org.example;

public class App {
    public static void main(String[] args) {
        Circle myCircle = new Circle(6.0);
        System.out.println("Circle -> Area: " + myCircle.computeArea());
        System.out.println("Circle -> Circumference: " + myCircle.computePerimeter());

        Rectangle myRectangle = new Rectangle(5.0, 8.0);
        System.out.println("\nRectangle -> Area: " + myRectangle.computeArea());
        System.out.println("Rectangle -> Perimeter: " + myRectangle.computePerimeter());
        System.out.println("Rectangle -> Sides: " + myRectangle.getSides());

        Square mySquare = new Square(7.0);
        System.out.println("\nSquare -> Area: " + mySquare.computeArea());
        System.out.println("Square -> Perimeter: " + mySquare.computePerimeter());
        System.out.println("Square -> Sides: " + mySquare.getSides());

        RightTriangle myTriangle = new RightTriangle(6.0, 8.0);
        System.out.println("\nRight Triangle -> Area: " + myTriangle.computeArea());
        System.out.println("Right Triangle -> Perimeter: " + myTriangle.computePerimeter());
        System.out.println("Right Triangle -> Sides: " + myTriangle.getSides());

        IsoscelesRightTriangle myIsoTriangle = new IsoscelesRightTriangle(7.0);
        System.out.println("\nIsosceles Right Triangle -> Area: " + myIsoTriangle.computeArea());
        System.out.println("Isosceles Right Triangle -> Perimeter: " + myIsoTriangle.computePerimeter());
        System.out.println("Isosceles Right Triangle -> Sides: " + myIsoTriangle.getSides());
    }
}
