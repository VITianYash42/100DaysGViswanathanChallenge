                                                     // 2009B - osu!mania //

import java.io.*;

public class Day85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] answer = new int[n];

            for (int i = 0; i<n; i++) {
                String row = br.readLine().trim();
                answer[i] = row.indexOf('#') + 1;
            }

            for (int i = n- 1; i >=0; i--) {
                sb.append(answer[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}