                                                   // 1829A - Love Story //

package Solutions;
import java.util.*;

public class Day08 {
    public static void main (String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String s2 = "codeforces";
        
        while (t -- > 0) {
            String s1 = sc.next();
            int counter = 0;
            
            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                
                if (c1 != c2) {
                    counter += 1;
                }
            }
            System.out.println(counter);
        }
        sc.close();
     }
}