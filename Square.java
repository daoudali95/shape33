package com.company;

import java.util.Scanner;

public class Square extends Shape{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void Area() {
        System.out.println("Area of this square: "+length*length);
    }

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of this square: "+ (4*length));
    }
}
