package org.example;

class RightTriangle extends Shape implements Polygon {
    protected double base;
    protected double height;

    public RightTriangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }

    @Override
    public double computePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }

    @Override
    public int getSides() {
        return 3;
    }
}
