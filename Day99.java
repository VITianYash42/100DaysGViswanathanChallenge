                                                // 1985B - Maximum Multiple Sum //

import java.io.*;

public class Day99 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == 3) {
                sb.append(3).append("\n");
            } 
            else {
                sb.append(2).append("\n");
            }
        }
        System.out.print(sb);
    }
}