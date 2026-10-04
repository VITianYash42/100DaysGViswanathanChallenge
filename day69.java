                                                      // 1853A - Desorting //

import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                
                for (int i = 0; i<n; i++) {
                    a[i] = sc.nextInt();
                }
                int min = Integer.MAX_VALUE;
                boolean sorted = true;

                for (int i = 0; i<n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        sorted = false;
                        break;
                    }
                    
                    int diff = a[i +1] - a[i];
                    int ops = (diff / 2) +1;
                    min = Math.min(min, ops);
                }
                
                if (!sorted) {
                    System.out.println(0);
                } 
                else {
                    System.out.println(min);
                }
            }
        }
        sc.close();
    }
}