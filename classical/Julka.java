// Problem URL : http://www.spoj.com/problems/JULKA/
import java.math.BigInteger;
import java.util.Scanner;

class Julka {

    public static void main(String args[]) {
        BigInteger total, lead;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            total = s.nextBigInteger();
            lead = s.nextBigInteger();
            find f = new find();
            f.findAnswer(total, lead);

        }

    }
}

class find {

    public BigInteger j, k, a;
    BigInteger two = new BigInteger("2");

    public void findAnswer(BigInteger t, BigInteger l) {
        j = t.divide(two);
        a = l.divide(two);
        j = j.subtract(a);
        k = j.add(l);

        System.out.println(k + "\n" + j);
    }
}
