                                                      // 1807A - Plus or Minus //

package Solutions;
import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i =1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a + b == c) {
                System.out.println("+");
            }
            else if (a - b == c) {
                System.out.println("-");
            }
        }
        sc.close();
    }
}