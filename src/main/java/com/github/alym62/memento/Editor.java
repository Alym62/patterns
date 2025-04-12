package com.github.alym62.memento;

public class Editor {
    private String content;

    public void writer(String newContent) {
        this.content = newContent;
    }

    public Memento save() {
        return new Memento(this.content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState();
    }

    public String getContent() {
        return this.content;
    }
}
