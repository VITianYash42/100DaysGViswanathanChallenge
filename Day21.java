                                                        // 750A - New Year and Hurry //

import java.util.*;

public class Day21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int remaining_time = 240 - k;
        int count  = 0;
        
        for (int i = 1; i <=n; i++) {
            if (remaining_time >= 5 * i) {
                remaining_time = remaining_time - (5 * i);
                count++;
            }
            else {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}