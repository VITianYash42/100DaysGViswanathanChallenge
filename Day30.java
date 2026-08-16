                                                // 1926A - Vlad and the Best of Five //

import java.util.*;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            
            char[] arr = s.toCharArray();
            int counter_A = 0;
            int counter_B = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'A') {
                    counter_A += 1;
                }
                else {
                    counter_B += 1;
                }
            }
            if (counter_A > counter_B) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
        sc.close();
    }
}