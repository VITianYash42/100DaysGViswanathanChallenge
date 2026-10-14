                                                          // 1921A - Square //

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i<4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt(); 

                if (x < min) min = x;
                if (x > max) max = x;
            }

            int side = max - min;
            int area = side *side;

            System.out.println(area);
        }
        sc.close();
    }
}