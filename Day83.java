                                                 // 2000A - Primary Task //

import java.io.*;

public class Day83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String a = br.readLine().trim();
            
            if (a.length() >= 3 && a.startsWith("10") && a.charAt(2) != '0' && Integer.parseInt(a.substring(2)) >= 2) {
                sb.append("YES\n");
            } 
            else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}