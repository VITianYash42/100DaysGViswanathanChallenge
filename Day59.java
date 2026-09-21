                                                  // 758A - Holiday of Equality //

import java.util.*;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] welfare = new int[n];
        int max = 0;

        for (int i = 0; i<n; i++) {
            welfare[i] = sc.nextInt();
            if (welfare[i] > max) {
                max = welfare[i];
            }
        }
        int total_burles = 0;
        for (int i = 0; i<n; i++) {
            total_burles += (max - welfare[i]);
        }
        
        System.out.println(total_burles);
        sc.close();
    }
}