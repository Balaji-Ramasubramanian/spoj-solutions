// Problem URL : http://www.spoj.com/problems/AE00/

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import java.util.Scanner;
class Rectangle
{
    public static void main(String[] args)
    {
        double n,r;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int p = (int) floor(sqrt(n)); 
        int sum=0; 
      
     for(int i=1;i<=p;i++)
      { 
        sum+=floor(n/i) - (i-1); 
      } 
        System.out.println(sum);
    }
}