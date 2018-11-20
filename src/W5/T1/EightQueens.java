package W5.T1;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Checks if 8 queens are placed on a chess board correctly
 * Link: https://open.kattis.com/contests/ww2rp4/problems/8queens
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/20/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class EightQueens {

    public static void main(String[] args) {
        boolean queens[][] = getBoard();

        for (int i = 0; i < queens.length; i++) {
            checkRow(queens, i);
            checkColumn(queens, i);
            for (int j = 0; j < queens.length; j++) {
                if (queens[i][j]) checkDiagonals(queens, i, j);
            }
        }
        System.out.println("valid");
    }

    private static void invalid() {
        System.out.println("invalid");
        System.exit(0);
    }

    // checks all 4 diagonals from queen location
    private static void checkDiagonals(boolean[][] queens, int queenX, int queenY) {
        // first diagonal
        for (int i = queenX+1, j = queenY+1; i<8 && j<8 ; i++, j++) {
            if (queens[i][j]) invalid();
        }
        // second diagonal
        for (int i = queenX+1, j = queenY-1; i<8 && j>=0; i++, j--) {
            if (queens[i][j]) invalid();
        }
        // third diagonal
        for (int i = queenX-1, j = queenY+1; i>=0 && j<8; i--, j++) {
            if (queens[i][j]) invalid();
        }
        // fourth diagonal
        for (int i = queenX-1, j = queenY-1; i>=0 && j>=0; i--, j--) {
            if (queens[i][j]) invalid();
        }
    }

    // checks if there is exactly one queen in a row
    private static void checkRow(boolean[][] queens, int rowNumber) {
        boolean[] row  = queens[rowNumber];
        int cnt = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i]) cnt++;
        }
        if (cnt != 1) invalid();
    }

    // checks if there is exactly one queen in a colum
    private static void checkColumn(boolean[][] queens, int colNumber) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            if (queens[i][colNumber]) cnt++;
        }
        if (cnt != 1) invalid();
    }

    private static boolean[][] getBoard() {
        boolean[][] board = new boolean[8][8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            String input = sc.nextLine();

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '*') board[i][j] = true;
            }
        }
        sc.close();
        return board;
    }
}
