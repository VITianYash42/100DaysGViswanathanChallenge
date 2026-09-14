                                                  // 1877A - Goals of Victory //

import java.util.*;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            
            for (int i = 0; i<n - 1; i++) {
                sum += sc.nextInt();
            }
            System.out.println(-sum);
        }
    }
}