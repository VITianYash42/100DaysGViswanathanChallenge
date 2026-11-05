                                                     // 1955A - Yogurt Sale //

import java.io.*;
import java.util.*;

public class Day98 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (b < 2*a) {
                int cost = (n/ 2) * b +(n % 2)* a;
                sb.append(cost).append("\n");
            } else {
                int cost = n*a;
                sb.append(cost).append("\n");
            }
        }
        System.out.print(sb);
    }
}