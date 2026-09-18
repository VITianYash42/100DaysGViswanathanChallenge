                                                        // 2185B - Prefix Max //

import java.util.*;

public class Day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            
            int max_sum = 0;

            for (int i = 0; i<n; i++) {
                for (int j = i; j < n; j++) {
                    swap(a, i, j);

                    int current_sum = 0;
                    int current_max = 0;
                    
                    for (int k = 0; k<n; k++) {
                        current_max = Math.max(current_max, a[k]);
                        current_sum += current_max;
                    }
                    max_sum = Math.max(max_sum, current_sum);
                    swap(a, i, j);
                }
            }
            System.out.println(max_sum);
        }
        sc.close();
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}