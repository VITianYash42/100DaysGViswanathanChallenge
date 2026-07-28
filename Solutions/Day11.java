                                                  // 1850A - To My Critics //

package Solutions;
import java.util.*;

public class Day11 {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i<= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}