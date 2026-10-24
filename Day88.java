                                                     // 1783A - Make it Beautiful //

import java.io.*;
import java.util.*;

public class Day88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            
            for (int i = 0; i<n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            if (a[0] == a[n - 1]) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
                sb.append(a[n - 1]);
                
                for (int i = 0; i< n - 1; i++) {
                    sb.append(" ").append(a[i]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}