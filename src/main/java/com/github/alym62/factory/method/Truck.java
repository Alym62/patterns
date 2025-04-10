package com.github.alym62.factory.method;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Enviando por caminhão >>>");
    }

    @Override
    public double calcFee(double distance) {
        return 5 * distance;
    }
}
