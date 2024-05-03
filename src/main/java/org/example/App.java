package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game(scan);
        game.play();
        scan.close();
    }
}