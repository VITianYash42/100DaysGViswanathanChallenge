                                                      // 1370A - Maximum GCD //

import java.util.*;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int answer = n / 2;
            
            System.out.println(answer);
        }
        sc.close();
    }
}