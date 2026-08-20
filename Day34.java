                                                         // 1676A - Lucky? //

import java.util.*;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String input = sc.next();
            int[] numbers = new int[6];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.charAt(i) - '0';
            }
            int sum1 = numbers[0] + numbers[1] + numbers[2];
            int sum2 = numbers[3] + numbers[4] + numbers[5];
            
            if (sum1 == sum2) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}