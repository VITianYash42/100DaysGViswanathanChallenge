                                                      // 144A - Arrival of the General //

import java.util.*;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int max_height = 0;
        int min_height = 101;
        int max_index = 0;
        int min_index = 0;

        for (int i = 0; i<n; i++) {
            int current_height = sc.nextInt();

            if (current_height > max_height) {
                max_height = current_height;
                max_index = i;
            }

            if (current_height <= min_height) {
                min_height = current_height;
                min_index = i;
            }
        }

        int total_swaps = max_index + (n -1) -min_index;

        if (max_index > min_index) {
            total_swaps = total_swaps -1;
        }
        
        System.out.println(total_swaps);
        sc.close();
    }
}