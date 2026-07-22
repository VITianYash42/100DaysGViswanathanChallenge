                                                 // 1999A - A + B Again? // 

package Solutions;
import java.util.*;

public class Day04 {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            
            int division = n / 10;
            int modulo = n % 10;
            
            int answer = division + modulo;
            
            System.out.println(answer);
        }
        sc.close();
    }
}