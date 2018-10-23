package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Misa.java Calculates how many hands Mirko is going to shake
 * Link: https://open.kattis.com/contests/eu6hf6/problems/misa
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class Misa {

    private static Scanner sc;
    // public to exchange matrix and its length and height with Coordinate class
    public static int length;
    public static int height;
    public static boolean[][] matrix;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Misa.matrix = initMatrix();
        sc.close();

        Coordinate m = getMirkoCoordinate();
        if (m != null) {
            // insertes Mirko
            matrix[m.r][m.c] = true;
        }

        System.out.println(countHandshakes());
    }

    // counts the possible handshake in a given Matrix
    private static int countHandshakes() {
        int cnt = 0;
        Coordinate curr = new Coordinate(0, 0);
        do {
            boolean run = true;
            do {
                if (curr.isOccupied()) {
                    if (curr.getRight() != null && curr.getRight().isOccupied()) {
                        cnt++;
                    }
                    if (curr.getUp() != null && curr.getUp().isOccupied()) {
                        cnt++;
                    }
                    if (curr.getUpperRight() != null && curr.getUpperRight().isOccupied()) {
                        cnt++;
                    }
                    if (curr.getLowerRight() != null && curr.getLowerRight().isOccupied()) {
                        cnt++;
                    }
                }
                if (curr.getRight() != null) {
                    curr = curr.getRight();
                } else {
                    run = false;
                }

            } while (run);
            curr.c = 0;
            curr = curr.getUp();
        } while (curr != null);
        return cnt;
    }

    // gets Mirkos seat
    private static Coordinate getMirkoCoordinate() {
        int cnt = 0;
        Coordinate res = null;
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < length; c++) {

                int temp_cnt = 0;
                Coordinate temp = new Coordinate(r, c);
                if (!temp.isOccupied()) {
                    if(temp.getLeft() != null && temp.getLeft().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getRight() != null && temp.getRight().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getUp() != null && temp.getUp().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getDown() != null && temp.getDown().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getUpperLeft() != null && temp.getUpperLeft().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getLowerLeft() != null && temp.getLowerLeft().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getUpperRight() != null && temp.getUpperRight().isOccupied()) {
                        temp_cnt++;
                    }
                    if(temp.getLowerRight() != null && temp.getLowerRight().isOccupied()) {
                        temp_cnt++;
                    }
                    if (temp_cnt > cnt) {
                        cnt = temp_cnt;
                        res = temp;
                    }
                }
            }
        }
        return res;
    }

    // builds the matrix out of the user input
    private static boolean[][] initMatrix() {
        String[] input = sc.nextLine().split(" ");
        height = Integer.parseInt(input[0]);
        length = Integer.parseInt(input[1]);
        boolean[][] matrix = new boolean[height][];

        for (int i = 0; i < height; i++) {
            char[] temp = sc.nextLine().toCharArray();
            matrix[i] = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (temp[i2] == 'o') {
                    matrix[i][i2] = true;
                } else {
                    matrix[i][i2] = false;
                }
            }
        }
        return matrix;
    }
}

// helping class for working with the coordinates in the matrix
class Coordinate {
    public int r;
    public int c;

    public Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public Coordinate getLeft() {
        if (c > 0) {
            return (new Coordinate(r, c-1));
        }
        return null;
    }
    public Coordinate getRight() {
        if (c < Misa.length-1) {
            return new Coordinate(r, c+1);
        }
        return null;
    }
    public Coordinate getUp() {
        if (r < Misa.height-1) {
            return new Coordinate(r+1, c);
        }
        return null;
    }
    public Coordinate getDown() {
        if (r > 0) {
            return new Coordinate(r-1, c);
        }
        return null;
    }
    public Coordinate getUpperLeft() {
        if (this.getLeft() == null) return null;
        return this.getLeft().getUp();
    }
    public Coordinate getUpperRight() {
        if (this.getRight() == null) return null;
        return this.getRight().getUp();
    }
    public Coordinate getLowerLeft() {
        if (this.getLeft() == null) return null;
        return this.getLeft().getDown();
    }
    public Coordinate getLowerRight() {
        if (this.getDown() == null) return null;
        return this.getDown().getRight();
    }
    public boolean isOccupied() {
        return Misa.matrix[r][c];
    }
}