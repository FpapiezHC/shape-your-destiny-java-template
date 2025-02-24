package org.example;

class Rectangle extends Shape implements Polygon {
    protected double height;
    protected double width;
    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }
    @Override
    public double computeArea() {
        return height * width;
    }
    @Override
    public double computePerimeter() {
        return 2 * (height + width);
    }
    @Override
    public int getSides() {
        return 4;
    }
}

