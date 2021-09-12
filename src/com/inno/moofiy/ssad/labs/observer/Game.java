package com.inno.moofiy.ssad.labs.observer;

public class Game {

    public String title;

    public Game(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                '}';
    }
}
