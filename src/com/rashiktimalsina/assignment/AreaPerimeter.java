package com.rashiktimalsina.assignment;

public class AreaPerimeter {
    public static void main(String[] args) {

        final double PI = 3.14;
        int radius = 20, length = 24, breadth = 25;

        int areaOfSquare = length * length;
        int areaOfRectangle = length * breadth;
        double areaOfCircle = PI * (radius * radius);

        int perimeterOfSquare = 4 * length;
        int perimeterOfRectangle = 2 * (length * breadth);
        double perimeterOfCircle = 2 * PI * radius;

        System.out.println("Area of the square: " + areaOfSquare);
        System.out.println("Area of the rectangle: " + areaOfRectangle);
        System.out.printf("Area of the circle: %.2f%n ", areaOfCircle);        //Round up decimal to two O's adding newline

        System.out.println("Perimeter of the square: " + perimeterOfSquare);
        System.out.println("Perimeter of the rectangle: " + perimeterOfRectangle);
        System.out.printf("Perimeter: %.2f%n ", perimeterOfCircle);   //Round up decimal to two O's adding newline .


    }

}
