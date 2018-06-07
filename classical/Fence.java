// Problem URL = http://www.spoj.com/problems/FENCE1/

// The length of the fence is the circumference of the semi-circle (PI*r)
// PI * r = L
// r = L/PI
// To find the area of the semi-circle,
// = (PI*r*r)/2 
// = (PI*(L/PI)*(L/PI))/2
// = (L*L)/(2*PI)

import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {
        int L;
        Scanner sc = new Scanner(System.in);
        while(true){
            L = sc.nextInt();
            if(L == 0) break;
            double area = (L*L)/(3.14159*2); 
            System.out.println(String.format("%.2f", area)); // Rounded 2 digits after the decimal point
        }
    }
    
}
