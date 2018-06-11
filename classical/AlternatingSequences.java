//Problem URL = http://www.spoj.com/problems/ALTSEQ/

import java.util.Arrays;
import java.util.Scanner;

class AlternatingSequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        // Getting inputs
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int lis[] = new int[n];
        Arrays.fill(lis,1); // Initialize array elements with 1
        
        // Longest increasing subsequence algorithm for alternative signed numbers
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<0 && arr[j]>0){
                    if(-1*arr[i] >arr[j]){
                       lis[i] = max(lis[i],lis[j]+1);
                    }
                }
                else if (arr[i] >0 && arr[j]<0) {
                    if(arr[i] > -1*arr[j]){
                    lis[i] = max(lis[i],lis[j]+1);
                    }
                }
            }
        }
        printMax(lis,n);
    }
    
    // Return maximum of 2 numbers
    public static int max(int a , int b){
        return (a>b) ? a: b;
    }
    
    // Print the Maximum number in the array
    public static void printMax(int a[], int n){
        int max =0;
        for(int i=0;i<n;i++){
            if(max < a[i]) max = a[i];
        }
        System.out.println(max);
    }
}