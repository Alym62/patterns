package com.github.alym62.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notice) {
        for (Observer observer : observers) {
            observer.update(notice);
        }
    }

    public void publisherNotice(String notice) {
        System.out.println("📰 Nova notícia publicada: " + notice);
        notifyObservers(notice);
    }
}
