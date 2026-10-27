                                                   // 1722B - Colourblindness //

import java.io.*;

public class Day91 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String row1 = br.readLine().trim();
            String row2 = br.readLine().trim();

            boolean match = true;
            for (int i = 0; i<n; i++) {
                char c1 = row1.charAt(i);
                char c2 = row2.charAt(i);

                if ((c1 == 'R' && c2 != 'R') || (c1!= 'R' &&c2 == 'R')) {
                    match = false;
                    break;
                }
            }

            if (match) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}