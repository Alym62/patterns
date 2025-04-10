package com.github.alym62;

import com.github.alym62.factory.method.Transport;
import com.github.alym62.factory.method.factories.ShipFactory;
import com.github.alym62.factory.method.factories.TransportFactory;
import com.github.alym62.factory.method.factories.TruckFactory;
import com.github.alym62.factory.simple.Shape;
import com.github.alym62.factory.simple.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        // Simple Factory pattern
        simpleFactory();

        // Factory method pattern
        factoryMethod();
    }

    /**
    * @author Alyasaf Meireles
     */
    private static void simpleFactory() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShapeFactory("circle");
        circle.draw();

        Shape rectangle = factory.createShapeFactory("rectangle");
        rectangle.draw();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void factoryMethod() {
        TransportFactory truck = new TruckFactory();
        Transport transportTruck = truck.createTransport();

        transportTruck.deliver();
        System.out.println(transportTruck.calcFee(15.7));

        TransportFactory ship = new ShipFactory();
        Transport transportShip = ship.createTransport();

        transportShip.deliver();
        System.out.println(transportShip.calcFee(15.7));
    }
}