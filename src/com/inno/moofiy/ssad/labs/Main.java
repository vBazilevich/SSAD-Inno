package com.inno.moofiy.ssad.labs;

import com.inno.moofiy.ssad.labs.observer.*;
import com.inno.moofiy.ssad.labs.observer.fans.DarkSoulsFan;
import com.inno.moofiy.ssad.labs.observer.fans.HorizonFan;
import com.inno.moofiy.ssad.labs.observer.fans.PlaystationFan;

public class Main {


    // TODO Implement Homework
    public static void main(String[] args) {
	// welcome to class
        System.out.println("Welcome to class");
        PlaystationManager manager = new PlaystationManager();
        DarkSoulsFan fan1= new DarkSoulsFan();
        HorizonFan fan2= new HorizonFan();
        PlaystationFan fan3= new PlaystationFan();
        manager.subscribeToPlaystaion(fan1);
        manager.subscribeToPlaystaion(fan2);
        manager.subscribeToPlaystaion(fan3);
        manager.addGame();
    }
}
