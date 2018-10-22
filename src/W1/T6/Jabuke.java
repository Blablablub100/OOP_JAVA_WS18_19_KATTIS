package W1.T6;

import java.util.Scanner;

public class Jabuke {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] tri = getTriangle();
        int amount = Integer.valueOf(sc.nextLine());
        int[][] treeLocs = getTreeLocs(amount);
        double area = calcArea(tri);

        System.out.println(area);


    }

    private static boolean treeOnTri(int[][] tri, int[] tree) {
        int x = tree[0];
        int y = tree[1];
        int[] t1 = tri[1];
        int[] t2 = tri[2];
        int[] t3 = tri[3];

        // TODO implement method to check if tree is on triangle
    }

    private static double calcArea(int[][] tri) {
        double t1 = (double) (tri[0][0] * (tri[1][1]-tri[2][1]));
        double t2 = (double) (tri[1][0] * (tri[2][1]-tri[0][1]));
        double t3 = (double) (tri[2][0] * (tri[0][1]-tri[1][1]));
        return ((t1+t2+t3)/2);
    }

    private static int[][] getTriangle() {
        int[][] tri = new int[3][];
        for (int i = 0; i < tri.length; i++) {
            tri[i] = getCoordinate();
        }
        return tri;
    }

    private static int[] getCoordinate() {
        String[] temp = sc.nextLine().split(" ");
        int[] res = new int[2];
        res[0] = Integer.valueOf(temp[0]);
        res[1] = Integer.valueOf(temp[1]);
        return res;
    }

    private static int[][] getTreeLocs(int amount) {
        int[][] treeLocs = new int[amount][];
        for (int i = 0; i < amount; i++) {
            treeLocs[i] = getCoordinate();
        }
        return treeLocs;
    }
}

