                                                      // 1560A - Dislikes Of Threes //

import java.util.*;

public class Day09 {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i<t; i++) {
            int k = sc.nextInt();
            
            int currentNum = 0;
            int LikeCount = 0;
            
            while (LikeCount < k) {
                currentNum += 1;
                
                if (currentNum % 3 != 0 && currentNum % 10 != 3) {
                    LikeCount += 1;
                }
            }
            System.out.println(currentNum);
        }
        sc.close();
    }
}