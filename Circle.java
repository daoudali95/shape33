package com.company;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void Area() {
        System.out.println("Area of this circle: "+(radius*3.14*3.14));
    }

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of this circle: "+(2*3.14*radius));
    }
}
