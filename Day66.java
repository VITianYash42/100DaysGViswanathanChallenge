                                                            // 1901A - Line Trip //

import java.util.*;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            int min_volume = a[0];
            for (int i = 1; i < n; i++) {
                min_volume = Math.max(min_volume, a[i] -a[i - 1]);
            }
            min_volume = Math.max(min_volume, 2 * (x - a[n - 1]));
            
            System.out.println(min_volume);
        }
        sc.close();
    }
}