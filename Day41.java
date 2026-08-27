                                                  // 1703B - ICPC Balloons //

import java.util.*;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            boolean[] visited = new boolean[26];
            int total_balloons = 0;
            
            for (int i = 0; i<n; i++) {
                char ch = s.charAt(i);
                int index = ch -'A';
                
                if (!visited[index]) {
                    total_balloons += 2;
                    visited[index] = true;
                } else {
                    total_balloons += 1;
                }
            }
            
            System.out.println(total_balloons);
        }
        sc.close();
    }
}
