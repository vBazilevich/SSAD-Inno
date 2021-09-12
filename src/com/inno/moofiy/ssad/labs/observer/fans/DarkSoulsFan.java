package com.inno.moofiy.ssad.labs.observer.fans;

import com.inno.moofiy.ssad.labs.builders.Game;
import com.inno.moofiy.ssad.labs.observer.Observer;

public class DarkSoulsFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.getTitle().toLowerCase().contains("dark souls")) {
            System.out.println("I'm a Dark souls fan");
            System.out.println("Dark Soul is Here go to store NOW $$$$$g");
            System.out.println("------------");
        }
    }
}