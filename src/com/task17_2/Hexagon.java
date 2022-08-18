package com.task17_2;

public class Hexagon extends AbstractShape{
    public Hexagon(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return 6 * getA();
    }
}
