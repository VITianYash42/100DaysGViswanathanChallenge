                                                         // 707A - Brain's Photos //
 
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean color = false;

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                char pixel = sc.next().charAt(0);

                if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                    color = true;
                }
            }
        }
        if (color) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
        
        sc.close();
    }
}