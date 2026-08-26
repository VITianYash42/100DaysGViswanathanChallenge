                                              // 1760B - Atilla's Favourite Problem // 

import java.util.*;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                
                int max_value = 0;
                for (int i = 0; i<n; i++) {
                    int current = s.charAt(i) - 'a' +1;
                    if (current >max_value) {
                        max_value = current;
                    }
                }
                System.out.println(max_value);
            }
        }
        sc.close();
    }
}
