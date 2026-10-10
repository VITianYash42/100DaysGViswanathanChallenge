                                                  // 1426A - Floor Number //

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n <= 2) {
                System.out.println(1);
            } 
            else {
                int floor = 1 + (n - 2 + x - 1) /x;
                System.out.println(floor);
            }
        }
        sc.close();
    }
}