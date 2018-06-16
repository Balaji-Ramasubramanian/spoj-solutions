// Problem URL = https://www.spoj.com/problems/SHAKTI/

import java.util.Scanner;

public class SHAKTI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0 ){
            long n = sc.nextLong();
            if (n%2 == 0){
                System.out.println("Thankyou Shaktiman");
            } else{
                System.out.println("Sorry Shaktiman");
            }
            testcases--;
        }
    }
    
}
