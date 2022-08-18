package com.task17_2;

public class Circle extends AbstractShape{
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getA();
    }
}
