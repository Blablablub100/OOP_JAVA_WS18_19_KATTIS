package W3.T6;

import java.util.*;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Putting words together
 * Link: https://open.kattis.com/contests/ww2rp4/problems/compoundwords
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class CompoundWords {

    public static void main(String[] args) {

        // user input
        List<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            input.add(sc.next());
        sc.close();

        // Hashset is used to remove duplicates
        Set<String> temp = new HashSet<String>();

        for (int i = 0; i < input.size(); i++) {
            String curr = input.get(i);
            for (int i2 = 0; i2 < input.size(); i2++) {
                if (i != i2) {
                    temp.add(curr + input.get(i2));
                    temp.add(input.get(i2) + curr);
                }
            }
        }
        // Set gets converted to Arraylist for sorting
        List<String> res = new ArrayList<String>();
        res.addAll(temp);
        Collections.sort(res);


        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
