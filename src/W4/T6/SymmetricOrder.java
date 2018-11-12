package W4.T6;

import java.util.*;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Sort a List of Strings in a specific way
 * Link: https://open.kattis.com/contests/ww2rp4/problems/symmetricorder
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/12/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.08
 */

public class SymmetricOrder {

    public static void main(String[] args) {
        List<String[]> input = getInput();
        for (int i = 0; i < input.size(); i++) {

            // Sort each input list
            String[] out = sort(input.get(i));
            System.out.println("SET " + (i+1));
            // Print every single String
            for (String anOut : out) {
                System.out.println(anOut);
            }
        }
    }


    // sorts the array in the right way
    private static String[] sort(String[] input) {
        String[] res = new String[input.length];
        LinkedList<int[]> sortedLengths = new LinkedList<>();

        // sort input descending
        for (int i = 0; i < input.length; i++) {
            int[] tmp = new int[2];
            tmp[0] = i; // index
            tmp[1] = input[i].length();
            if (sortedLengths.size() == 0) {
                sortedLengths.add(tmp);
            } else if (sortedLengths.get(i-1)[1] > tmp[1]) {
                sortedLengths.addFirst(tmp);
            } else {
                sortedLengths.addLast(tmp);
            }
        }

        // sort descending list in right sort order
        int res_index = 0;
        for (int input_index = 0;
            input_index < input.length;
            input_index = input_index +2) {
            res[res_index] = input[sortedLengths.get(input_index)[0]];
            if (input_index+1 < input.length) {
                res[res.length - res_index - 1] = input[sortedLengths.get(input_index + 1)[0]];
            }
            res_index++;
        }
        return res;
    }

    // user input
    private static List<String[]> getInput() {
        List<String[]> input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            size = Integer.parseInt(sc.nextLine());
            String[] tmp = new String[size];
            for (int i = 0; i < size; i++) {
                tmp[i] = sc.nextLine();
            }
            if (tmp.length > 0) {
                input.add(tmp);
            }
        } while (size != 0);
        sc.close();
        return input;
    }
}
