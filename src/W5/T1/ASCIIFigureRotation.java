package W5.T1;

import java.util.Scanner;

public class ASCIIFigureRotation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int longest = 0;
        String[] input = new String[100];

        do {
            n = sc.nextInt();
            if (n == 0) System.exit(0);
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                input[i] = sc.nextLine();
                if (input[i].length() > longest) longest = input[i].length();
            }

            for (int y = 0; y < longest; y++) {
                for (int x = n - 1; x >= 0; x--) {
                    if (y >= input[x].length());


                    else if (endCheck(input, longest, x, y)) x = n;


                    else if (input[x].charAt(y) == '-') System.out.print('|');
                    else if (input[x].charAt(y) == '|') System.out.print('-');
                    else System.out.print(input[x].charAt(y));
                }
                System.out.println();
            }

            System.out.println();
        }while (n != 0);
    }

    private static boolean endCheck(String[] input, int longest, int x, int y) {
        boolean run = false;
        for(int i = x; i < longest; i++ ) {
            if(input[i].charAt(y) == '\0') run = true;
            else run = false;
        }
        return run;
    }
}