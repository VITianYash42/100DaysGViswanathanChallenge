                                                       // 1791A - Codeforces Checking //

import java.util.*;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String s1 = "codeforces";
        
        for (int i = 1; i <= t; i++) {
            char c = sc.next().charAt(0);
            
            if (s1.indexOf(c) != -1) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    } 
}