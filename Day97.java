                                                  // 1850C - Word on the Paper //

import java.io.*;

public class Day97 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringBuilder word = new StringBuilder();

            for (int i = 0; i<8; i++) {
                String row = br.readLine().trim();
                for (int j = 0; j<8; j++) {
                    char c = row.charAt(j);
                    if (c != '.') {
                        word.append(c);
                    }
                }
            }
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}