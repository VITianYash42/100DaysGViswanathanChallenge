                                                         // 1343B - Balanced Array //

import java.util.*;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i<t; i++) {
            int n = sc.nextInt();

            if (n % 4 != 0) {
                System.out.println("No");
            } 
            else {
                System.out.println("Yes");
                
                int half = n/2;
                int even_sum = 0;
                int odd_sum = 0;

                int current_even = 2;
                for (int j = 0; j<half; j++) {
                    System.out.print(current_even + " ");
                    even_sum += current_even;
                    current_even += 2;
                }

                int current_odd = 1;
                for (int j = 0; j<half -1; j++) {
                    System.out.print(current_odd + " ");
                    odd_sum += current_odd;
                    current_odd += 2;
                }
                int last_odd = even_sum - odd_sum;
                System.out.println(last_odd);
            }
        }
        sc.close();
    }
}
