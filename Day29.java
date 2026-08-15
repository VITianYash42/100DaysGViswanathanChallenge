                                                   // 1760A - Medium Number //

import java.util.*;

public class Day29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int[] numbers = {a, b, c};
            
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
        }
        sc.close();
    }
}