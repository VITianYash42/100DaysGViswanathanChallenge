                                                        // 1367B - Even Array //

import java.util.*;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int c = 0; c <t; c++) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i =0; i <n; i++) {
                a[i] = sc.nextInt();
            }
            
            int wrong_even = 0;
            int wrong_odd = 0;

            for (int i =0; i < n; i++) {
                if (i % 2 == 0 && a[i] % 2 != 0) {
                    wrong_odd += 1;
                }
                if (i % 2 != 0 && a[i] % 2 == 0) {
                    wrong_even += 1;
                }
            }

            if (wrong_even ==wrong_odd) {
                System.out.println(wrong_even);
            } 
            else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}