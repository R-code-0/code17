package com.task17_2;

public class Square extends AbstractShape{
    public Square(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return 4 * getA();
    }
}
