                                                   // 732A - Buy a Shovel //

import java.util.*;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        for (int n = 1; n<=10; n++) {
            int total_cost = n * k;
            if (total_cost %10 == 0 || total_cost % 10 ==r) {
                System.out.println(n);
                break;
            }
        }
        sc.close();
    }
}