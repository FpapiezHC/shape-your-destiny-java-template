package org.example;

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }
}
