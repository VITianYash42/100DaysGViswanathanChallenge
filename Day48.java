                                                     // 1766A - Extremely Round //

import java.util.*;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            
            int length = s.length();
            int first = s.charAt(0) - '0';
            
            int answer = (length- 1) * 9 +first;
            System.out.println(answer);
        }
        sc.close();
    }
}
