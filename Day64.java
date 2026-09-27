                                                      // 431A - Black Square //

import java.util.*;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        a[4] = sc.nextInt();
        
        String s = sc.next();
        int total = 0;
    
        for (int i = 0; i<s.length(); i++) {
            int number = s.charAt(i) - '0';
            total += a[number];
        }
        
        System.out.println(total);
        sc.close();
    }
}