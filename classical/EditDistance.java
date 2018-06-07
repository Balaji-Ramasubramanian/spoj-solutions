// Problem URL = http://www.spoj.com/problems/EDIST/

import java.util.Scanner;
class EditDistance {

    public static void main(String[] args) {
        int testcase;
        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt(); // Get number of testcases
        while(testcase>0){
            String a,b;
            a = sc.next(); // get first string
            b = sc.next(); // get second string
            int aLength = a.length();
            int bLength = b.length();
            int minArr[][]= new int[(aLength+1)][(bLength+1)]; // Declare an Array
            for(int i=0;i<=aLength;i++){
                minArr[i][0] = i;       // Initialize the firts column.
            }
            for(int i=0;i<=bLength;i++){
                minArr[0][i] = i;       // Initialize the first row
            }
            for(int i=1;i<=aLength;i++){
                for(int j=1;j<=bLength;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        minArr[i][j]=minArr[i-1][j-1];
                    }else{
                        int min = findMin(minArr[i-1][j],minArr[i][j-1],minArr[i-1][j-1]); 
                        minArr[i][j] = min+1;
                    }
                }
            }
            
            System.out.println(minArr[aLength][bLength]);
            testcase--;    
        }
        
    }
    
    // To find the minimum of 3 numbers
    public static int findMin(int a, int b, int c){
        int min = a;
        if(min>b) min = b;
        if(min>c) min = c;
        return min;
    }
}
