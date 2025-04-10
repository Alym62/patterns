package com.github.alym62.factory.method.factories;

import com.github.alym62.factory.method.Ship;
import com.github.alym62.factory.method.Transport;

public class ShipFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
