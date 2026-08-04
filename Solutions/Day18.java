                                                       // 520A - Pangram //

package Solutions;
import java.util.*;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        s = s.toLowerCase();
        
        boolean missing = false;
        
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                missing = true;
                break;
            }
        }
        if (missing) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
        sc.close();
    }
}