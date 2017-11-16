// Problem URL : http://www.spoj.com/problems/NSTEPS/

import java.util.Scanner;
class NumberSteps
{
    public static void main(String[] args)
    {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int x,y;
            x=s.nextInt();
            y=s.nextInt();
            if(x!=y && x!=y+2)
                System.out.println("No Number");           
            else if(x==y && x%2==1)
                System.out.println(2*x-1);
            else if(x==y && x%2==0)
                System.out.println(2*x);
            else if(x!=y && x%2==0)
                System.out.println(2*x-2);
            else
                System.out.println(2*x-3);
                                    
           
        }
    }
}