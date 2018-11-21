package W5.T1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        int n = sc.nextInt();
        sc.nextLine();

        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();

        for(int i = 0; i < n; i++) {
            String tmp1 = sc.nextLine();
            String[] tmp2 = tmp1.split(" ");

            if(!(x.add(Integer.valueOf(tmp2[0])))) {
                run = false;
                break;
            }
            if(!(y.add(Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }

            if(!(res1.add(Integer.valueOf(tmp2[0]) - Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }

            if(!(res2.add(Integer.valueOf(tmp2[0]) + Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }
        }

        if(run) System.out.println("CORRECT");
        else System.out.println("INCORRECT");
    }
}