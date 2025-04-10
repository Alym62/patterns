package com.github.alym62.factory.simple;

public class ShapeFactory {
    public Shape createShapeFactory(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) return new Circle();
        if (shapeType.equalsIgnoreCase("rectangle")) return new Rectangle();

        return null;
    }
}
