package com.inno.moofiy.ssad.labs.observer.fans;

import com.inno.moofiy.ssad.labs.observer.Game;
import com.inno.moofiy.ssad.labs.observer.Observer;

public class HorizonFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.title.toLowerCase().contains("horizon")) {
            System.out.println("I'm Horizon fan");
            System.out.println("Yes,lets Go Aloy!! ... ");
            System.out.println("------------");
        }
    }
}
