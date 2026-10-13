                                                     // 1807B - Grab the Candies //

import java.util.*;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum_even = 0;
            int sum_odd = 0;
            
            for (int i = 0; i<n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    sum_even += a;
                } else {
                    sum_odd += a;
                }
            }

            if (sum_even > sum_odd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}