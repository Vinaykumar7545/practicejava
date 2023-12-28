package geometry;

import java.util.Scanner;

//Abstract class representing a geometric shape
abstract class Shape {
 // Abstract method to calculate the area
 abstract double calculateArea();
}

//Class representing a rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 double calculateArea() {
     return length * width;
 }
}

//Class representing a circle
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of the calculateArea method for a circle
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Class representing a triangle
class Triangle extends Shape {
 private double base;
 private double height;

 // Constructor
 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 // Implementation of the calculateArea method for a triangle
 @Override
 double calculateArea() {
     return 0.5 * base * height;
 }
}

//Main class
public class Shape {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Rectangle
     System.out.print("Enter length of the rectangle: ");
     double rectLength = scanner.nextDouble();
     System.out.print("Enter width of the rectangle: ");
     double rectWidth = scanner.nextDouble();
     Rectangle rectangle = new Rectangle(rectLength, rectWidth);
     System.out.println("Area of the rectangle: " + rectangle.calculateArea());

     // Circle
     System.out.print("Enter radius of the circle: ");
     double circleRadius = scanner.nextDouble();
     Circle circle = new Circle(circleRadius);
     System.out.println("Area of the circle: " + circle.calculateArea());

     // Triangle
     System.out.print("Enter base of the triangle: ");
     double triBase = scanner.nextDouble();
     System.out.print("Enter height of the triangle: ");
     double triHeight = scanner.nextDouble();
     Triangle triangle = new Triangle(triBase, triHeight);
     System.out.println("Area of the triangle: " + triangle.calculateArea());

     scanner.close();
 }
}