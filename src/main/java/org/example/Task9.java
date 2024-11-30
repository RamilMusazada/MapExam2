package org.example;

public class Task9 {
    public static void main(String[] args) {
        Shape rectangele = new Rectangle(10, 5);
        Shape circle = new Circle(10);
        System.out.println("Rectangle's area is : " + rectangele.area());
        System.out.println("Rectangle's perimeter is : " + rectangele.perimeter());
        System.out.println("Circle's perimeter is : " + circle.perimeter());
        System.out.println("Circle's area is : " + circle.area());
    }
}

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}