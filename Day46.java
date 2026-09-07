                                                      // 977A - Wrong Subtraction //

import java.util.*;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i<k; i++) {
            if (n % 10 == 0) {
                n = n /10;
            } 
            else {
                n = n- 1;
            }
        }
        System.out.println(n);
        sc.close();
    }
}