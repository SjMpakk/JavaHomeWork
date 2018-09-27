/**
 *
 * Java homework 4
 *
 * @author Alexey Denisov
 * @version dated Sep 23, 2018
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    Scanner sc = new Scanner(System.in);
    final int SIZE = 5;
    final int WIN_SIZE = 4;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Random rand = new Random();

    public static void main(String[] args) {
        new HomeWork4().game();
    }

    void game() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("You win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, draw  ");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, draw  ");
                break;
            }
        }
        System.out.println("Game over");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("enter X (vertical) and Y(horizontal) range: 1..." + SIZE + " :");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {
        int horizontal;
        int vertical;
        int diagonalX = 0; // diagonal "\"
        int diagonalY = 0; // diagonal "/"
        int i;
        int j;
        for (i = 0; i < SIZE; i++) {
            horizontal = 0;
            vertical = 0;
            for (j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    horizontal++;
                    if (horizontal == WIN_SIZE) return true;
                } else horizontal = 0;
                if (map[j][i] == dot) {
                    vertical++;
                    if (vertical == WIN_SIZE) return true;
                } else vertical = 0;
            }
            if (map[i][i] == dot) {
                diagonalX++;
                if (diagonalX == WIN_SIZE) return true;
            } else diagonalX = 0;
            if (map[i][SIZE - 1 - i] == dot) {
                diagonalY++;
                if (diagonalY == WIN_SIZE) return true;
            } else diagonalY = 0;
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;
    }
}