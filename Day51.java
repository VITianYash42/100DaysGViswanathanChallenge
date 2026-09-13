                                               // 1352A - Sum of Round Numbers //

import java.util.*;

public class Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> round = new ArrayList<>();
            int factor = 1;

            while (n > 0) {
                int digit = n %10;
                if (digit > 0) {
                    round.add(digit *factor);
                }
                
                n /= 10;
                factor *= 10;
            }
            System.out.println(round.size());

            for (int i = 0; i <round.size(); i++) {
                System.out.print(round.get(i) + (i == round.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}