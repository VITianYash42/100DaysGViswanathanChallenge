                                                     // 1881A - Don't try to Count //

import java.util.*;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            
            int operations = 0;
            boolean found = false;
            
            while (operations <= 6) {
                if (x.contains(s)) {
                    found = true;
                    break;
                }
                x += x;
                operations++;
            }
            
            if (found) {
                System.out.println(operations);
            } 
            else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}