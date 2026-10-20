                                                     // 490A - Team Olympiad //

import java.util.*;

public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        List<Integer> programmers = new ArrayList<>();
        List<Integer> mathematicians = new ArrayList<>();
        List<Integer> sportsmen = new ArrayList<>();

        for (int i = 1; i<=n; i++) {
            int t = sc.nextInt();
            if (t== 1) {
                programmers.add(i);
            } else if (t == 2) {
                mathematicians.add(i);
            } else if (t == 3) {
                sportsmen.add(i);
            }
        }

        int w = Math.min(programmers.size(), 
                 Math.min(mathematicians.size(), sportsmen.size()));

        System.out.println(w);
        
        for (int i = 0; i<w; i++) {
            System.out.println(programmers.get(i) + " " + 
                               mathematicians.get(i) + " " + 
                               sportsmen.get(i));
        }
        sc.close();
    }
}