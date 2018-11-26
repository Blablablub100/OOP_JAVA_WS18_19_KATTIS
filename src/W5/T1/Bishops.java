package W5.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculates when Ants fall of a pole
 * Link: https://open.kattis.com/problems/bishops
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/22/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.09
 */


import java.util.Scanner;

public class Bishops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        // runs while there are integers in the keyboard buffer
        do{
            input = sc.nextInt();
            if(input == 0) System.out.println(0);
            else if(input == 1) System.out.println(1);
            else if(input > 1) System.out.println(input*2 -2);
        } while(sc.hasNextInt());
    }
}