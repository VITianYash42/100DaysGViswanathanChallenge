                                                       // 1294A - Collecting Coins //

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();

            long max = Math.max(a, Math.max(b, c));

            long needed = (max - a)+ (max - b) +(max - c);

            if (n >= needed && (n - needed)% 3 == 0) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}