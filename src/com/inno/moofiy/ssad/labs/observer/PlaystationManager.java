package com.inno.moofiy.ssad.labs.observer;


import java.util.Scanner;

public class PlaystationManager {

    private final Scanner scanner;
    private Playstaion playstaion;

    public PlaystationManager() {
        // dependency injection
        this.playstaion = new Playstaion();
        scanner = new Scanner(System.in);
    }

    public void addGame() {
        System.out.println("Enter the name of the new Game");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("exit"))
                break;
            Game game = new Game(line);
            playstaion.notify(game);
        }
    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        playstaion.subscribe(fan);
    }
}
