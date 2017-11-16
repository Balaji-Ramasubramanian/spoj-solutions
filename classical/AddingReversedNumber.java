//Problem URL : http://www.spoj.com/problems/ADDREV/

import java.util.Scanner;
class AddingReversedNumber {

    public static void main(String[] args) {
        int a, b, N;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        for (int i = 0; i < N; i++) {
            a = s.nextInt();
            b = s.nextInt();
            add sum = new add(a, b);
            sum.ans();
        }

    }
}

class add {

    public int a, b, sum, revsum = 0, reva = 0, revb = 0;

    public add(int x, int y) {
        a = x;
        b = y;
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = (rev * 10) + x % 10;
            x = x / 10;
        }
        return rev;
    }

    public void ans() {
        reva = reverse(a);
        revb = reverse(b);
        sum = reva + revb;
        revsum = reverse(sum);
        System.out.println(revsum);
    }

}
