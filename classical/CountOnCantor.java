// Problem URL : http://www.spoj.com/problems/CANTON/

import java.util.Scanner;
class cantor
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t;
        t=s.nextInt();
         while(t>0)
            {
           
            long a,b,c,sum=0,n,i;
            n=s.nextInt();
               
                for( i=0;sum<n;)
                {  i++;
                    sum+=i;
                }
            
             b=n-sum+i;
             a=i-b+1;
                
                 if(i%2==1)
                    System.out.println("TERM "+n+" IS "+a+"/"+b);
                 else
                     System.out.println("TERM "+n+" IS "+b+"/"+a);
           t--;
            }
    }
}