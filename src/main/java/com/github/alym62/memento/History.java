package com.github.alym62.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMementoByIndex(int index) {
        return this.mementos.get(index);
    }
}
