package com.task17_2;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(12.3);
        System.out.println(sq.getPerimeter());
        Rectangle r = new Rectangle(1.2, 3.4);
        System.out.println(r.getPerimeter());
        Triangle t = new Triangle(1.1, 2.2, 3.3);
        System.out.println(t.getPerimeter());
        Circle c = new Circle(4.5);
        System.out.println(c.getPerimeter());
        Hexagon h = new Hexagon(9.9);
        System.out.println(h.getPerimeter());
    }
}
