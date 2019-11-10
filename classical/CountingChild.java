//Problem URL: https://www.spoj.com/problems/CTTC/
// My solution uses Stack to solve the problem. Using DSU (Disjoint Union Set) is also preferable solution for this problem.

import java.util.Scanner;
import java.util.Stack;

public class CountingChild {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        // Iterate for var testcases times
        for(int i=1; i <= testcases; i++) {
            int n = sc.nextInt();
            int[] childs = new int[n];
            Stack<Integer> stack = new Stack<Integer>();

            // Getting the route of traversal and process the count child action
            for(int k =0; k<n*2; k++) {
                int element = sc.nextInt();
                if(stack.size()>0 && stack.peek() == element ) {
                    stack.pop();
                } else {
                    if(stack.size() > 0 )
                        childs[stack.peek()-1] = childs[stack.peek()-1]+1;
                    stack.push(element);
                }
            }

            // Printing the result
            System.out.println("Case "+i+":");
            for(int j=0; j<n; j++) {
                System.out.println(j+1+" -> "+childs[j]);
            }
        }
    }
    
}
