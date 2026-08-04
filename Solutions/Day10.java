                                                      // 1512A - Spy Detected! //

import java.util.*;

public class Day10 {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int common_num = 0;
            if (a[0] == a[1]) {
                common_num = a[0];
            }
            else if (a[1] == a[2]) {
                common_num = a[1];
            }
            else if (a[0] == a[2]) {
                common_num = a[2];
            }
            for (int i = 0; i<n; i++) {
                if (a[i] != common_num) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
        
    }
}