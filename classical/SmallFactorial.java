// Problem URL : http://www.spoj.com/problems/FCTRL2/

import java.math.BigInteger;
import java.util.Scanner;

class SmallFactorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, a;
        BigInteger ans;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            a = s.nextInt();
            fact f = new fact();
            f.factorial(a);

        }
    }
}

class fact {

    BigInteger ans = new BigInteger("1");
    BigInteger x = new BigInteger("1");
    BigInteger one = new BigInteger("1");

    public void factorial(int a) {
        while (a != 0) {
            ans = ans.multiply(x);
            x = x.add(one);
            a--;
        }
        System.out.println(ans);
    }
}
