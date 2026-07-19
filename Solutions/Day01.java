package Solutions;
                               // 1915A - Odd One Out  //                    

import java.util.Scanner;
 
public class Day01 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == b) {
                System.out.println(c);
            }
            else if (b == c) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        sc.close();
    }
}