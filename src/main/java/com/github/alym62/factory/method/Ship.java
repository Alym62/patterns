package com.github.alym62.factory.method;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Enviando por navio >>>");
    }

    @Override
    public double calcFee(double distance) {
        return 20 * distance;
    }
}
