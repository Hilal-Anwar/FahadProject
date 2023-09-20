package org.graded.classes.core;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, float diagonal) {
        this.width = width;
        this.height = Math.sqrt(diagonal * diagonal - width * width);
    }

    private double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public void draw() {
        for (int i = 0; i <=height; i++)
        {
            for (int j = 0; j<=width; j++)
            {
                if (j % width == 0 || i % height == 0)
                    System.out.print("██");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
