                                                 // 1866A - Ambitious Kid //

import java.io.*;
import java.util.*;

public class Day73 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min_operations = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++) {
            int current = Integer.parseInt(st.nextToken());
            int operations = Math.abs(current);
            
            if (operations < min_operations) {
                min_operations = operations;
            }
        }
        System.out.println(min_operations);
    }
}