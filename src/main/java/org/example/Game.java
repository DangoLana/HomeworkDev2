package org.example;

import java.util.Scanner;

public class Game {
    private Scanner scan;
    private Board board;
    private char currentPlayer;
    private boolean isGameFinished;

    public Game(Scanner scan) {
        this.scan = scan;
        this.board = new Board();
        this.currentPlayer = 'X';
        this.isGameFinished = false;
        System.out.println("Enter box number to select. Enjoy!\n");
    }

    public void play() {
        while (!isGameFinished) {
            board.display();

            char playerSymbol = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

            int input = getUserInput();
            board.updateBoard(input, playerSymbol);

            if (board.checkWinner(playerSymbol)) {
                board.display();
                if (playerSymbol == 'X') {
                    System.out.println("You won the game!\nCreated by Shreyas Saha. Thanks for playing!");
                } else {
                    System.out.println("You lost the game!\nCreated by Shreyas Saha. Thanks for playing!");
                }
                isGameFinished = true;
            } else if (board.isDraw()) {
                board.display();
                System.out.println("It's a draw!\nCreated by Shreyas Saha. Thanks for playing!");
                isGameFinished = true;
            }
        }
    }

    private int getUserInput() {
        int input;
        while (true) {
            input = scan.nextInt();
            if (input > 0 && input < 10 && board.isCellEmpty(input)) {
                break;
            } else {
                System.out.println("Invalid input. Enter again.");
            }
        }
        return input;
    }
}
