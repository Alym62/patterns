package com.github.alym62.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String notice) {
        System.out.printf("Nome: %s recebeu %s\n", this.name, notice);
    }
}
