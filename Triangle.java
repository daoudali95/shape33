package com.company;

public class Triangle extends Shape{
    private int height;
    private int base;
    private int a,b,c;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void Area() {
        System.out.println("Area of this Triangle: "+(height*base)/2);
    }

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of this Triangle: "+(a+b+c));
    }
}
