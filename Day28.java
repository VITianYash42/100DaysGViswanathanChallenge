                                                      // 1985A - Creating Words //

import java.util.*;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            
            char[] a1 = a.toCharArray();
            char[] b1 = b.toCharArray();
            
            char temp = a1[0];
            a1[0] = b1[0];
            b1[0] = temp;
            System.out.println(new String(a1) + " " + new String(b1));
        }
        sc.close();
    }
}