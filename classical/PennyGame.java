// Problem URL = https://www.spoj.com/problems/NY10A/

import java.util.Scanner;

class PenneyGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0 ){
            // Getting dataset value
            int n = sc.nextInt();
            int result[] = new int[8];
            sc.nextLine();
            // Getting sequence of 40 coin toss results
            String input = sc.nextLine();
            // Replacing H by 1 and T by 0. So that it looks like binary representation.
            input = input.replaceAll("H", "1");
            input = input.replaceAll("T", "0");

            for(int i=0;i<input.length()-2;i++){
                // Takes substring of length 3
                String substring = input.substring(i, i+3);
                // Converts the substring into decimal number
                int index = Integer.parseInt(substring, 2);
                // Increasing the count value
                result[index] +=1;
            }
            
            // Print the result
            System.out.print(n + " ");
            for(int i=0;i<8;i++){
                System.out.print(result[i] + " ");
            }
            testcases--;
        }
    }
    
}
