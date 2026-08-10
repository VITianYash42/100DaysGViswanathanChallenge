                                                    // 2094A - Trippi Troppi //

import java.util.*;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 1; i<=t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            
            char first = s1.charAt(0);
            char second = s2.charAt(0);
            char third = s3.charAt(0);
            
            System.out.println("" + first + second + third);
        }
        sc.close();
    }
}