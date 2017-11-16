// Problem URL : http://www.spoj.com/problems/CANDY/

import java.util.Scanner;
class Candy_I
{
    public static void main(String [] args)
    {
        int r=0,t,x;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        
        while(t!=-1)
        { int a[]=new int[t];
          int sum=0,i;
          for( i=0;i<t;i++)
          { a[i]=s.nextInt();
              sum+=a[i];
          }
          if(sum%t!=0)
          {
              System.out.println("-1");
          }
          else
          {  x=sum/t; r=0;
              for(i=0;i<t;i++)
              {
                if(a[i]<x)  
                  {
                    r+=x-a[i];
                  }
              }
               System.out.println(r);
          }
           
          t=s.nextInt();
        }
        
    }
}