package org.example;

public class Board {
    private char[] cells;

    public Board() {
        cells = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    public void display() {
        System.out.println("\n\n " + cells[0] + " | " + cells[1] + " | " + cells[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + cells[3] + " | " + cells[4] + " | " + cells[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + cells[6] + " | " + cells[7] + " | " + cells[8] + " \n");
    }

    public void updateBoard(int cellNumber, char symbol) {
        cells[cellNumber - 1] = symbol;
    }

    public boolean checkWinner(char symbol) {
        return (cells[0] == symbol && cells[1] == symbol && cells[2] == symbol) ||
                (cells[3] == symbol && cells[4] == symbol && cells[5] == symbol) ||
                (cells[6] == symbol && cells[7] == symbol && cells[8] == symbol) ||
                (cells[0] == symbol && cells[3] == symbol && cells[6] == symbol) ||
                (cells[1] == symbol && cells[4] == symbol && cells[7] == symbol) ||
                (cells[2] == symbol && cells[5] == symbol && cells[8] == symbol) ||
                (cells[0] == symbol && cells[4] == symbol && cells[8] == symbol) ||
                (cells[2] == symbol && cells[4] == symbol && cells[6] == symbol);
    }

    public boolean isDraw() {
        for (char cell : cells) {
            if (cell != 'X' && cell != 'O') {
                return false;
            }
        }
        return true;
    }

    public boolean isCellEmpty(int cellNumber) {
        return cells[cellNumber - 1] != 'X' && cells[cellNumber - 1] != 'O';
    }
}
