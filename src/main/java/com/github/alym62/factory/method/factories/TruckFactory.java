package com.github.alym62.factory.method.factories;

import com.github.alym62.factory.method.Transport;
import com.github.alym62.factory.method.Truck;

public class TruckFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
