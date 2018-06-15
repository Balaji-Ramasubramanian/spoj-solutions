// Problem URL = https://www.spoj.com/problems/FAVDICE/

import java.util.Scanner;
class FavoriteDice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting number of testcases
        int testcases = sc.nextInt();
        while(testcases > 0 ){
            // Getting number of sides in the die
            int n = sc.nextInt();
            double probability = 0;
            for(double i=1;i<=n;i++){
                probability += (1/i);
            }
            // Printing the result in 2 decimal digit
            System.out.println(String.format("%.2f",n*probability));
            testcases--;
        }
    }
    
}
