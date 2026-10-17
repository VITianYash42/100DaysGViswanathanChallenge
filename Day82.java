                                                         // 1389A - LCM Problem //

import java.io.*;
import java.util.*;

public class Day82 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());

            if (2 * l<=r) {
                sb.append(l).append(" ").append(2 * l).append("\n");
            } 
            else {
                sb.append("-1 -1\n");
            }
        }
        System.out.print(sb);
    }
}