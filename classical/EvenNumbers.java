// Problem URL = http://www.spoj.com/problems/EC_CONB/

import java.util.Scanner;

class EvenNumbers {

    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();
        while(testcases > 0 ){
            int n = sc.nextInt();
            if(n%2 ==0 ){
                String temp = Integer.toBinaryString(n);  // Converts the decimal into binary (String)
                temp =  new StringBuffer(temp).reverse().toString();  // Reverse the String value
                System.out.println(Integer.parseInt(temp,2));   // Converts the String (binary) into Integer (decimal)
            } else{
                System.out.println(n);
            }
            testcases--;
        }
    }
    
}
