                                                     // 151A - Soft Drinking //

import java.util.*;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int from_drink = (k * l) /nl;
        int from_lime = c * d;
        int from_salt = p / np;
        int total = Math.min(from_drink, Math.min(from_lime, from_salt));
        int per_friend =total / n;

        System.out.println(per_friend);
        sc.close();
    }
}