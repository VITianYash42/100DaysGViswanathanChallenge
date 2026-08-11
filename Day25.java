                                                 // 1873C - Target Practice //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day25 {
    public static void main(String[] args) throws IOException {
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(b1.readLine().trim());
        
        StringBuilder s1 = new StringBuilder();
        
        while (t-- >0) {
            int total = 0;

            for (int i = 0; i <10; i++) {
                String line = b1.readLine();
                
                while (line == null || line.trim().isEmpty()) {
                    line = b1.readLine();
                }
                
                for (int j = 0; j < 10;j++) {
                    if (line.charAt(j) == 'X') {
                        int distance_r = Math.min(i, 9 - i);
                        int distance_c = Math.min(j, 9 - j);
                        int points = Math.min(distance_r, distance_c) + 1;
                        total += points;
                    }
                }
            }
            s1.append(total).append("\n");
        }
        System.out.print(s1.toString());
    }
}