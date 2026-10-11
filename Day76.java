                                                    // 1360B - Honest Coach //

import java.util.*;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];

            for (int i = 0; i<n; i++) {
                s[i] = sc.nextInt();
            }

            Arrays.sort(s);
            int min_diff = Integer.MAX_VALUE;
            for (int i = 0; i<n - 1; i++) {
                int diff = s[i + 1] -s[i];
                if (diff < min_diff) {
                    min_diff = diff;
                }
            }

            System.out.println(min_diff);
        }
        sc.close();
    }
}