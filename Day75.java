                                                          // 1996A - Legs //

import java.util.*;

public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int min_animals = (n / 4) +((n % 4) / 2);
            System.out.println(min_animals);
        }
        sc.close();
    }
}