                                                        // 271A - Beautiful Year //

package Solutions;
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        while(true) {
            y++;
            if(DistinctDigits(y)) {
                System.out.println(y);
                break;
            }
        }
        sc.close();
    }
    
    private static boolean DistinctDigits(int year) {
        int a = (year/1000);
        int b = (year/100) % 10;
        int c = (year/10) % 10;
        int d = (year) % 10;
        
        return a!=b && a!=c && a!=d && b!=c && b!=d && c!=d;
    }
}