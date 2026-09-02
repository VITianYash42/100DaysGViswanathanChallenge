                                                // 1335A - Candies and Two Sisters //

import java.io.*;
import java.util.*;

public class Day44 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int ans = (n - 1) / 2;
            
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}