                                                               // 9A - Die Roll //

import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int w = sc.nextInt();
        int max_roll = Math.max(y, w);

        int favorable = 6 - max_roll+1;
        int total = 6;

        int gcd = gcd(favorable, total);
        System.out.println((favorable /gcd) + "/" + (total /gcd));
        sc.close();
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}