package com.github.alym62.composite;

public class Text implements ComponentDocument {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println("Texto: " + this.content);
    }
}
