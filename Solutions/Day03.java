                                                   // 1703A - YES or YES //

package Solutions;

import java.util.*;

public class Day03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i< t; i++) {
            String s = sc.next().toUpperCase();
        
            if (s.equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}