package com.task17_2;

/*
  publicabstract double getPerimeter()
  абстракт методун  Shape деген класска кошунуз.
  Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.

  1.	Абстракт методу абстракт эмес класска кошулбайт. Shape абстракт класс эмес (AbstractShape эмес)
  2.	publicabstract double getPerimeter() Бул методду иштетүү үуүн биз параметрине маани бере албайбыз. Объекттен алуу болот.
*/
public abstract class AbstractShape {
    private double a, b, c;

    public AbstractShape(double a) {
        this.a = a;
    }

    public AbstractShape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public AbstractShape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double getPerimeter();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


}
