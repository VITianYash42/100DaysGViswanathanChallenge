                                                     // 1619A - Square String? //

import java.io.*;

public class Day94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            int len = s.length();

            if (len % 2 != 0) {
                sb.append("NO\n");
            } 
            else {
                int half = len/2;
                String first = s.substring(0, half);
                String second = s.substring(half);

                if (first.equals(second)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb);
    }
}