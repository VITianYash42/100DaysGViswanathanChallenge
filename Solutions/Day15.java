                                                       // 996A - Hit the Lottery //

package Solutions;
import java.util.*;

public class Day15 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int notes = 0;
        
        notes += n/100;
        n %= 100;
        
        notes += n/20;
        n %= 20;
        
        notes += n/10;
        n %= 10;
        
        notes += n/5;
        n %= 5;
        
        notes += n/1;
        n %= 1;
        
        System.out.println(notes);
        sc.close();
    }
}