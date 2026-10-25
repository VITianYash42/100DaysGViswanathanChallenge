                                                      // 702A - Maximum Increase //

import java.io.*;
import java.util.*;

public class Day89 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max_length = 1;
        int current_length = 1;
        int previous = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i<n; i++) {
            int current = Integer.parseInt(st.nextToken());
            if (current > previous) {
                current_length++;
                if (current_length > max_length) {
                    max_length = current_length;
                }
            } 
            else {
                current_length = 1;
            }
            previous = current;
        }
        System.out.println(max_length);
    }
}