package com.github.alym62;

import com.github.alym62.facade.EcommerceFacade;
import com.github.alym62.factory.method.Transport;
import com.github.alym62.factory.method.factories.ShipFactory;
import com.github.alym62.factory.method.factories.TransportFactory;
import com.github.alym62.factory.method.factories.TruckFactory;
import com.github.alym62.factory.simple.Shape;
import com.github.alym62.factory.simple.ShapeFactory;
import com.github.alym62.observer.Subscriber;
import com.github.alym62.observer.Observer;
import com.github.alym62.observer.Channel;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Simple Factory pattern
        simpleFactory();

        // Factory method pattern
        factoryMethod();

        // Observer pattern
        observer();

        // Facade pattern
        facade();
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

    /**
     * @author Alyasaf Meireles
     */
    private static void observer() {
        Channel channel = new Channel();

        Observer observerOne = new Subscriber("Alyasaf");
        Observer observerTwo = new Subscriber("Thaina");

        channel.addObserver(observerOne);
        channel.addObserver(observerTwo);

        channel.publisherNotice("Nova IA chinesa lançada: DeepSeek");

        channel.removeObserver(observerOne);
        channel.publisherNotice("Versão 24 do Java ☕");
    }

    /**
     * @author Alyasaf Meireles
     */
    public static void facade() {
        EcommerceFacade facade = new EcommerceFacade();
        facade.processOrder(UUID.randomUUID(), "aly@email.com", 3.185);
    }
}