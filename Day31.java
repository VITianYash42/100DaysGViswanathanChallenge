                                                      // 1742B - Increasing //

import java.util.*;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int numbers[] = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            
            Arrays.sort(numbers);
            
            boolean possible = true;
            for (int i = 0; i <n - 1; i++) {
                if (numbers[i] == numbers[i +1]) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}