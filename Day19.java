                                                     // 785A - Anton and Polyhedrons //

import java.util.*;

public class Day19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        int faces_count = 0;
        
        while (n-- >0) {
            String s = sc.nextLine();
            
            if (s.equals("Tetrahedron")) {
                faces_count += 4;
            }
            if (s.equals("Cube")) {
                faces_count += 6;
            }
            if (s.equals("Octahedron")) {
                faces_count += 8;
            }
            if (s.equals("Dodecahedron")) {
                faces_count += 12;
            }
            if (s.equals("Icosahedron")) {
                faces_count += 20;
            }
        }
        System.out.println(faces_count);
        sc.close();
    }
}