// Problem URL : http://www.spoj.com/problems/TRICOUNT/


import java.util.Scanner;
class CountingTriangle
{
    public static void main(String[] args)
    {
        long n,r,t;
        Scanner s=new Scanner(System.in);
        t=s.nextLong();
        while(t>0)
        {  
            n=s.nextLong();
            r=2*n*(n+2)*(2*n+1);
        
        if(n%2==0)
            r++;
        else
            r--;

        System.out.println(r/16);
       t--; 
        }
    }
}