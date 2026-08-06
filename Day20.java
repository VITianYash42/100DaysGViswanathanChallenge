                                                        // 141A - Amusing Joke //

import java.util.*;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();
        
        String joined = A + B;
        char[] joined_to_array = joined.toCharArray();
        char[] C1 = C.toCharArray();
        
        Arrays.sort(joined_to_array);
        Arrays.sort(C1);
        
        if (Arrays.equals(joined_to_array, C1)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}