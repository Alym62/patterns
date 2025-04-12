package com.github.alym62.composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements ComponentDocument {
    private String title;
    private List<ComponentDocument> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void addElement(ComponentDocument element) {
        this.elements.add(element);
    }

    @Override
    public void show() {
        System.out.println("Seção: " + this.title);
        for (ComponentDocument element : elements) {
            element.show();
        }
    }
}
