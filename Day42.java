                                                      // 443A - Anton and Letters //

import java.util.*;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        HashSet<Character> distinctLetters = new HashSet<>();
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                distinctLetters.add(ch);
            }
        }
        System.out.println(distinctLetters.size());
    }
}