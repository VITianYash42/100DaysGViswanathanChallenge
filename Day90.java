                                                          // 1676B - Equal candies //

import java.io.*;
import java.util.*;

public class Day90 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            long min = Long.MAX_VALUE;

            for (int i = 0; i<n; i++) {
                long a = Long.parseLong(st.nextToken());
                sum += a;
                if (a < min) {
                    min = a;
                }
            }

            long answer = sum - (n* min);
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}