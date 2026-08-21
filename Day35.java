                                                       // 1472B - Fair Division //

import java.util.*;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int count1 = 0;
            int count2 = 0;
            
            for (int i = 0; i <n; i++) {
                int w = sc.nextInt();
                if (w == 1) {
                    count1++;
                }
                else {
                    count2++;
                }
            }
            int total = count1 + (count2 *2);
            if (total % 2 == 0 && (count2 % 2 == 0 || count1 >= 2)) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}