                                                      // 1907A - Rook //

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            for (int i = 0; i<t; i++) {
                String position = sc.next();
                char coloumn = position.charAt(0);
                char row = position.charAt(1);
                
                for (char c = 'a'; c<= 'h'; c++) {
                    if (c != coloumn) {
                        System.out.println("" + c + row);
                    }
                }

                for (char r = '1'; r<= '8'; r++) {
                    if (r != row) {
                        System.out.println("" + coloumn + r);
                    }
                }
            }
        }
        sc.close();
    }
}