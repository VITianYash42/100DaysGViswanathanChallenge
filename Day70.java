                                                     // 1367A - Short Substrings //

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String b = sc.next();
            StringBuilder a = new StringBuilder();

            for (int i = 0; i<b.length(); i += 2) {
                a.append(b.charAt(i));
            }

            a.append(b.charAt(b.length() - 1));
            System.out.println(a.toString());
        }
        
        sc.close();
    }
} 