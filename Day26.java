                                                         // 1722A - Spell Check //

import java.util.*;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i<=t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n != 5) {
                System.out.println("No");
                continue;
            }
            
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            
            if(sorted.equals("Timru")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}