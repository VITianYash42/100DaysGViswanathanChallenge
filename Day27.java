                                                    // 1873A - Short Sort //

import java.util.*;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            
            if (s.equals("abc")) {
                System.out.println("Yes");
                continue;
            }
            
            char[] ch = s.toCharArray();
            boolean swapped = false;
            
            for (int i = 0; i<ch.length; i++) {
                for (int j = i+1; j<ch.length; j++) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    
                    if (ch[0] == 'a' && ch[1] == 'b' && ch[2] == 'c') {
                        swapped = true;
                    }
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            if (swapped) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}