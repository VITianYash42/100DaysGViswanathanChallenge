                                                   // 1669A - Division? //

package Solutions;
import java.util.*;

public class Day06 {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i<=t; i++) {
            int n = sc.nextInt();
            
            if (n <= 1399) {
                System.out.println("Division 4");
            }
            else if (1400 <= n && n <= 1599) {
                System.out.println("Division 3");
            }
            else if (1600 <= n && n <= 1899) {
                System.out.println("Division 2");
            }
            else if (n >= 1900) {
                System.out.println("Division 1");
            }
        }
        sc.close();
    }
}