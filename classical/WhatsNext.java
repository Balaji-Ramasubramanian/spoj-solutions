// Problem URL : http://www.spoj.com/problems/ACPC10A/

import java.util.Scanner;
class whatsnext {

    public static void main(String[] args) {
        float x, y, z, next;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        while (x != 0 || y != 0 || z != 0) {
            if (y == (x + z) / 2.0) {
                System.out.println("AP " + (int)(z + (y - x)));
            } else {
                System.out.println("GP " + (int)(z * (y / x)));
            }
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
        }
    }
}
