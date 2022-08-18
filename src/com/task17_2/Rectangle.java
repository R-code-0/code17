package com.task17_2;

public class Rectangle extends AbstractShape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return 2*(getA()+getB());
    }
}
