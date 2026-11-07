                                                     // 1772A

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String expr = br.readLine().trim();
            int plusidx = expr.indexOf('+');
            int a = Integer.parseInt(expr.substring(0, plusidx));
            int b = Integer.parseInt(expr.substring(plusidx + 1));

            sb.append(a + b).append("\n");
        }
        System.out.print(sb);
    }
}