package com.github.alym62;

import com.github.alym62.builder.Car;
import com.github.alym62.composite.ComponentDocument;
import com.github.alym62.composite.Section;
import com.github.alym62.composite.Text;
import com.github.alym62.facade.EcommerceFacade;
import com.github.alym62.factory.method.Transport;
import com.github.alym62.factory.method.factories.ShipFactory;
import com.github.alym62.factory.method.factories.TransportFactory;
import com.github.alym62.factory.method.factories.TruckFactory;
import com.github.alym62.factory.simple.Shape;
import com.github.alym62.factory.simple.ShapeFactory;
import com.github.alym62.memento.Editor;
import com.github.alym62.memento.History;
import com.github.alym62.observer.Channel;
import com.github.alym62.observer.Observer;
import com.github.alym62.observer.Subscriber;

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

        // Memento pattern
        memento();

        // Composite pattern
        composite();

        // Builder pattern
        builder();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void simpleFactory() {
        System.out.println("Simple factory pattern >>>");

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShapeFactory("circle");
        circle.draw();

        Shape rectangle = factory.createShapeFactory("rectangle");
        rectangle.draw();

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void factoryMethod() {
        System.out.println("Factory method pattern >>>");

        TransportFactory truck = new TruckFactory();
        Transport transportTruck = truck.createTransport();

        transportTruck.deliver();
        System.out.println(transportTruck.calcFee(15.7));

        TransportFactory ship = new ShipFactory();
        Transport transportShip = ship.createTransport();

        transportShip.deliver();
        System.out.println(transportShip.calcFee(15.7));

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void observer() {
        System.out.println("Observer pattern >>>");

        Channel channel = new Channel();

        Observer observerOne = new Subscriber("Alyasaf");
        Observer observerTwo = new Subscriber("Thaina");

        channel.addObserver(observerOne);
        channel.addObserver(observerTwo);

        channel.publisherNotice("Nova IA chinesa lançada: DeepSeek");

        channel.removeObserver(observerOne);
        channel.publisherNotice("Versão 24 do Java ☕");

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void facade() {
        System.out.println("Facade pattern >>>");
        EcommerceFacade facade = new EcommerceFacade();
        facade.processOrder(UUID.randomUUID(), "aly@email.com", 3.185);

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void memento() {
        System.out.println("Memento pattern >>>");
        Editor editor = new Editor();
        History history = new History();

        editor.writer("Oiiii");
        history.add(editor.save());

        System.out.println(editor.getContent());

        editor.writer("Tudo certo??");
        history.add(editor.save());

        System.out.println(editor.getContent());

        editor.restore(history.getMementoByIndex(0));

        System.out.println("Conteúdo atual: " + editor.getContent());

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void composite() {
        System.out.println("Composite pattern >>>");

        ComponentDocument textOneHeader = new Text("Olá mundo");
        ComponentDocument textTwoHeader = new Text("Aly");

        Section header = new Section("Cabeçalho");
        header.addElement(textOneHeader);
        header.addElement(textTwoHeader);

        ComponentDocument textOneBody = new Text("Conteúdo");
        ComponentDocument textTwoBody = new Text("Tudo certo");
        Section body = new Section("Corpo");
        body.addElement(textOneBody);
        body.addElement(textTwoBody);

        System.out.println("Documento completo:");
        header.show();
        body.show();

        System.out.println();
    }

    /**
     * @author Alyasaf Meireles
     */
    private static void builder() {
        System.out.println("Builder pattern >>>");

        Car car = new Car.Builder()
                .setEngine("V8")
                .setColor("Branco")
                .setWheels("18 inch")
                .setDoorQuantity(2)
                .build();

        System.out.println(car);

        System.out.println();
    }
}