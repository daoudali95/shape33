package com.company;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] shapes = {" ","Circle","Square","Triangle"};
        System.out.println("You have three shapes:");
        for (int i=1; i<=3; i++){
            System.out.println(i+") "+shapes[i]+"  ");
        }

        System.out.println("Which shape you want to choose?");
        int shape_input = scan.nextInt();

        if (shape_input==1){
            Circle circle_obj = new Circle();
            System.out.println("Do you want to find area of this circle?");
            System.out.println("Enter 1 for yes and 0 for no");
            int area_input = scan.nextInt();
            int perimeter_input;
            if (area_input==1){
                System.out.println("Enter radius of this circle");
                int radius_input = scan.nextInt();
                circle_obj.setRadius(radius_input);
                circle_obj.Area();
               perimeter_input = circle_obj.perimeter_input();
                if (perimeter_input==1){
                    circle_obj.Perimeter();
                }
            }
            if(area_input==0){
                perimeter_input = circle_obj.perimeter_input();
                if (perimeter_input==1){
                    circle_obj.Perimeter();
                }
            }
        }

        if (shape_input==2){
            Square square_obj = new Square();
            System.out.println("Do you want to find area of this square?");
            System.out.println("Enter 1 for yes and 0 for no");
            int area_input = scan.nextInt();
            int perimeter_input;
            if (area_input==1){
                System.out.println("Enter length of this square");
                int length_input = scan.nextInt();
                square_obj.setLength(length_input);
                square_obj.Area();
                perimeter_input = square_obj.perimeter_input();
                if (perimeter_input==1){
                    square_obj.Perimeter();
                }
            }
            if(area_input==0){
                perimeter_input = square_obj.perimeter_input();
                if (perimeter_input==1){
                    square_obj.Perimeter();
                }
            }
        }

        if (shape_input==3){
            Triangle triangle_obj = new Triangle();
            System.out.println("Do you want to find area of this triangle?");
            System.out.println("Enter 1 for yes and 0 for no");
            int area_input = scan.nextInt();
            int perimeter_input;
            if (area_input==1){
                System.out.println("Enter height of this triangle");
                int height = scan.nextInt();
                System.out.println("Enter base of this triangle");
                int base = scan.nextInt();
                triangle_obj.setHeight(height);
                triangle_obj.setBase(base);
                triangle_obj.Area();
                perimeter_input = triangle_obj.perimeter_input();
                if (perimeter_input==1){
                    System.out.println("Enter length of three sides of this triangle");
                    int a = scan.nextInt();
                    triangle_obj.setA(a);
                    int b = scan.nextInt();
                    triangle_obj.setB(b);
                    int c = scan.nextInt();
                    triangle_obj.setC(c);
                    triangle_obj.Perimeter();
                }
            }
            if(area_input==0){
                perimeter_input = triangle_obj.perimeter_input();
                if (perimeter_input==1){
                    triangle_obj.Perimeter();
                }
            }
        }


    }
}
