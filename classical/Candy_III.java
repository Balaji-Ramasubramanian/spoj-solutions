// Problem URL : http://www.spoj.com/problems/CANDY3/

import java.util.Scanner;

public class Candy_III {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for (int i = 0; i < num; i++) {
            long inputCount = sc.nextLong();
            long sum = 0;
            for (int j = 0; j < inputCount; j++) {
                long c = sc.nextLong();
                sum = (sum + c) % inputCount;
            }
            if (sum == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
