package W1.T6;

import java.util.Scanner;

public class Marko {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = Integer.valueOf(sc.nextLine());
        String[] input = new String[amount];

        for (int i = 0; i < amount; i++) {
            input[i] = sc.nextLine();
        }


    }
}
