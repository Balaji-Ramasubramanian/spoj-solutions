// Problem URL : http://www.spoj.com/problems/TOANDFRO/

import java.util.Scanner;
class ToAndFro
{
    public static void main(String[] args)
    {
        int n,m,j,i;      
        Scanner s=new Scanner(System.in); 
            n=s.nextInt();    
            char a[]=new char[200];
           while(n!=0)
           { 
            String str=s.next();
            a = str.toCharArray();
            m=a.length/n;  
              for( i=0;i<n;i++)
              {   
                  System.out.print(a[i]);
                  for(j=2;j<m;j+=2)
                  {
                      System.out.print(a[(j*n)-(i+1)]);
                      System.out.print( a[(j*n)+(i)]);
                  }
             
                  if((j-1)<m)
                     System.out.print(a[(m*n)-(i+1)]);
                    
              }
            System.out.println();
            n=s.nextInt();
           }

    }
}