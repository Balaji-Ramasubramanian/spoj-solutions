// Problem URL = http://www.spoj.com/problems/BWIDOW/

import java.util.Scanner;

class BWidow {

    public static void main(String[] args) {
        int testcase;
        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt();  // Getting number of testcases
        while(testcase>0){
            int n = sc.nextInt();
            int inner[] = new int[n];  // Array to store inner radius of rings
            int outter[] = new int[n]; // Array to store outter radius of rings
            // Getting inputs
            for(int i = 0; i < n; i++){
                inner[i] = sc.nextInt();
                outter[i] = sc.nextInt();
            }
            int maxInner = 0;
            int index = -1;
            int maxOutter = 0;
            // Find a ring that can be distructive ring
            for(int i = 0; i < n; i++){
                if(maxInner < inner[i]) {
                    maxInner = inner[i];
                    index = i;
                }
            }
            // Find the maximum outter radius of other rings 
            for(int i = 0; i < n; i++){
                if(i != index && maxOutter < outter[i]){
                    maxOutter = outter[i];
                }
            }
            if( maxInner <= maxOutter ) System.out.println("-1");
            else System.out.println(index+1);
            testcase--;
        }
    }
    
}
