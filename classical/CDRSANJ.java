// Problem URL = https://www.spoj.com/problems/CDRSANJ/

import java.util.Scanner;

class CDRSANJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
    
    public static int recursion(int n) {
       if(n<3) {
           return n;
       } 
       if(n%2==1) {
           return 0;
       } else {
           return (2 + recursion(n/2));
       }
    }
}
