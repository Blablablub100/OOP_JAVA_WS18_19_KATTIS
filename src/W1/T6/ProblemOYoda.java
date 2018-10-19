package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: ProblemOYoda.java let two integers collide
 * Link: https://open.kattis.com/contests/eu6hf6/problems/yoda
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class ProblemOYoda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputN = sc.nextLine();
        String inputM = sc.nextLine();
        char[] tempN = inputN.toCharArray();
        char[] tempM = inputM.toCharArray();
        int[] n = charArrToIntArr(tempN);
        int[] m = charArrToIntArr(tempM);

        String nString = "";
        String mString = "";

        int nIndex = n.length-1;
        int mIndex = m.length-1;

        for (int i = 0; (nIndex>0) && (mIndex>0); i++) {
            nIndex = nIndex-i;
            mIndex = mIndex-i;
            if (n[nIndex] > m[mIndex]) {
                nString = n[nIndex] + nString;
            } else if (n[nIndex] < m[mIndex]) {
                mString = m[mIndex] + mString;
            } else {
                nString = n[nIndex] + nString;
                mString = m[mIndex] + mString;
            }
        }

        nString = nString + inputN.substring(0, nIndex);
        mString = mString + inputM.substring(0, mIndex);

        if (nString.equals("")) {
            nString = "YODA";
        }
        if (mString.equals("")) {
            mString = "YODA";
        }

        System.out.println(nString);
        System.out.println(mString);
    }

    private static int[] charArrToIntArr(char[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = Integer.parseInt(String.valueOf(arr[i]));
        }
        return res;
    }
}
