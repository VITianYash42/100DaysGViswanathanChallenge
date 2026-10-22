                                                        // 1814A - Coins //

import java.io.*;
import java.util.*;

public class Day86 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            if (n % 2 == 0 || k % 2 == 1) {
                sb.append("YES\n");
            } 
            else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}