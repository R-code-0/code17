package com.task17_2;

public class Triangle extends AbstractShape{
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC();
    }
}
