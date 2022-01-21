package hackerEarth;

import java.util.Scanner;

public class MaxtheModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = sc.next();
            int ans = MaxModulo(a, b, c);
            System.out.println(ans);
        }

    }

    static int MaxModulo(int a, int b, String c) {
        int ans = Integer.MIN_VALUE;
        int d = Integer.parseInt(c);
        ans = d % b;
        for (int i = 0; i < c.length(); i++) {
            StringBuffer s = new StringBuffer();

            for (int j = 0; j < c.length(); j++) {
                if (j != i) {
                    s.append(c.charAt(j));
                }
            }
            String e = s.toString();
            d = Integer.parseInt(e);
            int f = d % b;
            ans = Math.max(ans, f);

        }

        return ans;
    }

}
