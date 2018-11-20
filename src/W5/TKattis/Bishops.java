package W5.TKattis;

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