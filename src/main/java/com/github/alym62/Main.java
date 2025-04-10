package com.github.alym62;

import com.github.alym62.factory.simple.Shape;
import com.github.alym62.factory.simple.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        // Simple Factory pattern
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShapeFactory("circle");
        circle.draw();

        Shape rectangle = factory.createShapeFactory("rectangle");
        rectangle.draw();
    }
}