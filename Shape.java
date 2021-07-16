package com.company;

import java.util.Scanner;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public abstract void Area();
    public abstract void Perimeter();

    public int perimeter_input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to find perimeter of this circle");
        System.out.println("Enter 1 for yes and 0 for no");
        int perimeter_input = scan.nextInt();
        return perimeter_input;
    }
}
