                                                   // 1950B - Upscaling //

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                solve(n);
            }
        }
        sc.close();
    }

    private static void solve(int n) {
        StringBuilder sb = new StringBuilder();
        int size = 2 * n;
        
        for (int r = 0; r <size; r++) {
            for (int c = 0; c<size; c++) {
                int row = r / 2;
                int coloumn = c / 2;

                if ((row + coloumn) %2 == 0) {
                    sb.append('#');
                } 
                else {
                    sb.append('.');
                }
            }
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
}