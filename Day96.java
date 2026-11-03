                                                         // 1433A - Boring Apartments //

import java.io.*;

public class Day96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String x = br.readLine().trim();
            int digit = x.charAt(0) - '0';
            int len = x.length();
            int total = (digit-1) * 10 +(len * (len + 1))/ 2;

            sb.append(total).append("\n");
        }
        System.out.print(sb);
    }
}