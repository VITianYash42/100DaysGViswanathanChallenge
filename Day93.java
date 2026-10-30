                                                        // 2260A - Monocarp's Contest //

import java.io.*;
import java.util.*;

public class Day93 {
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
            int zero_count = 0;
            for (int i = 0; i<n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] == 0) {
                    zero_count++;
                }
            }

            if (zero_count < 2) {
                sb.append("-1\n");
            } else {
                int ops = 0;
                if (a[0] != 0) ops++;
                if (a[n - 1] != 0) ops++;
                sb.append(ops).append("\n");
            }
        }
        System.out.print(sb);
    }
}