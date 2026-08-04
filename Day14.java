                                                       // 1692A - Marathon //

import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i<=t; i++) {
            int counter = 0;
            int a  = sc.nextInt();
            int b  = sc.nextInt();
            int c  = sc.nextInt();
            int d  = sc.nextInt();
            
            if (a < b) {
                counter++;
            }
            if (a < c) {
                counter++;
            }
            if (a < d) {
                counter++;
            }
            System.out.println(counter);
        }
        sc.close();
    }
}