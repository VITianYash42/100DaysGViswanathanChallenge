                                                           // 1535A - Fair Playoff //

import java.io.*;
import java.util.*;

public class Day87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            int s3 = Integer.parseInt(st.nextToken());
            int s4 = Integer.parseInt(st.nextToken());

            int w1 = Math.max(s1, s2);
            int l1 = Math.min(s1, s2);
            int w2 = Math.max(s3, s4);
            int l2 = Math.min(s3, s4);

            if (l1 > w2 || l2 > w1) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}