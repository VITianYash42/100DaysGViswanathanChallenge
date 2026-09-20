                                                        // 1873B - Good Kid //
 
import java.util.*;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            a[0]++;

            long max_prod = 1;
            for (int num : a) {
                max_prod *= num;
            }
            System.out.println(max_prod);
        }
        sc.close();
    }
}