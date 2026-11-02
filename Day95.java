                                              // 1283A - Minutes Before The New Year //

import java.io.*;
import java.util.*;

public class Day95 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        final int total = 1440;

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int elapsed_time = h*60+m;
            int remaining = total - elapsed_time;

            sb.append(remaining).append("\n");
        }
        System.out.print(sb);
    }
}