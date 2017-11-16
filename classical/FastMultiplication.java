// Problem URL : http://www.spoj.com/problems/MUL/

import java.math.BigInteger;
import java.util.Scanner;
class FastMultiplication
{
    public static void main(String args[])
    {  Scanner s = new Scanner(System.in);
        int t;
        t=s.nextInt();
        for(int i=0;i<t;i++)
      { 
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        System.out.println(a.multiply(b));
        
      }
    }
}