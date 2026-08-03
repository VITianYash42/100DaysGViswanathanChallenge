                                                 //228A - Is Your Horseshoe on the Other Hoof? //

package Solutions;
import java.util.*;

public class Day17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] s = new int[4];
        for (int i = 0; i < 4; i++) {
            s[i] = sc.nextInt();
        }
        
        int counter = 0;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < i; j++) {
                if (s[i] == s[j]) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}