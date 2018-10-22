package W1.T6;

import java.util.Scanner;

public class JumbledCompass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curr = Integer.valueOf(sc.nextLine());
        int corr = Integer.valueOf(sc.nextLine());
        sc.close();
        int res = 0;

        if (curr > corr) {
            res = curr-corr;
        } else if (curr < corr) {
            res = corr-curr;
        }
        if (res > 180) {
            res = res-360;
        } else if (res < -180) {
            res = res+360;
        }

        System.out.println(res);
    }
}
