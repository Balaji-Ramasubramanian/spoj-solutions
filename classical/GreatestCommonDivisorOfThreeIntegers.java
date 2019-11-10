
// Problem URL: https://www.spoj.com/problems/GDCOFTI/

import java.util.Scanner;

public class GreatestCommonDivisorOfThreeIntegers {

  public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
  		int b = sc.nextInt();
  		int c = sc.nextInt();

  		int result = gcd(a,gcd(b,c));
  		System.out.println(result);
  }
    
  // To find GCD of 2 numbers (Euclid's Algorithm)
  public static int gcd(int a, int b) { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
  }

}

