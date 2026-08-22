                                                   // 1669B - Triple //

import java.util.*;

public class Day36 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int answer = -1;
            
            for (int i = 0; i<n - 2; i++) {
                if (arr[i] == arr[i +2]) {
                    answer = arr[i];
                    break; 
                }
            }
            System.out.println(answer);
        }
        sc.close();
    }
}