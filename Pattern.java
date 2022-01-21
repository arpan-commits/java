import java.util.*;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your Row");

        int n = sc.nextInt();

        System.out.println(" Enter Your Coloumn");
        int m = sc.nextInt();
        // // First Loop
        // for (int i = 1; i <= n; i++) {
        // // Second Loop
        // for (int s = 1; s <= m; s++) {

        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0 && i < n - 1) {
                    if (j > 0 && j < m - 1) {
                        System.out.print(" ");
                    } else {

                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}