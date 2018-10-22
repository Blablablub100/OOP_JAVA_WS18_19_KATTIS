package W1.T6;

import java.util.Scanner;

public class JustAMinute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run;
        int cnt;

        do {
            run = false;
            cnt = sc.nextInt();
            if (cnt < 1 || cnt > 1000) run = true;
        } while (run);
        String[] wtimea = new String[cnt];
        double[] wtimeb = new double[cnt*2];
        sc.nextLine();

        double aRes = 0;
        double bRes = 0;
        double endRes;
        int bIndex = 0;

        do {
            run = false;
            for (int i = 0; i < cnt; i++) {
                wtimea[i] = sc.nextLine();
                String[] tmp = wtimea[i].split(" ");
                wtimeb[bIndex] = Double.valueOf(tmp[0]);
                if (wtimeb[bIndex] < 0 || wtimeb[bIndex] > 60) run = true;
                bIndex++;
                wtimeb[bIndex] = Double.valueOf(tmp[1]);
                if (wtimeb[bIndex] < 0 || wtimeb[bIndex] > 3600) run = true;
                bIndex++;
            }
        } while (run);
        sc.close();

        for (int i = 0; i < bIndex; i++) {
            bRes = bRes + wtimeb[i];
            i++;
            aRes = aRes + wtimeb[i];
        }
        endRes = aRes / (bRes * 60);

        if (endRes <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(endRes);
        }
    }
}
