                                                      // 1829B - Blank Space //

import java.util.*;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int max_blank = 0;
            int current_blank = 0;
            
            for (int i = 0; i<n; i++) {
                int element = sc.nextInt();
                
                if (element == 0) {
                    current_blank++;
                    if (current_blank > max_blank) {
                        max_blank = current_blank;
                    }
                } 
                else {
                    current_blank = 0;
                }
            }
            System.out.println(max_blank);
        }
        sc.close();
    }
}
