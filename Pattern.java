import java.util.*;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your Row");

        int n = sc.nextInt();

        System.out.println(" Enter Your Coloumn");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= m; s++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}