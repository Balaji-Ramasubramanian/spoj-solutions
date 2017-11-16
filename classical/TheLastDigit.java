// Problem URL : http://www.spoj.com/problems/LASTDIG/

import java.util.Scanner;
import java.lang.Math;
class lastdig
{ public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int i=0;i<t;i++)
    {
      long a,b,c;
      a=s.nextLong();
      b=s.nextLong();
      c=1;

      while(b>0) {
         if(b%2==1) c=(c*a)%10;
         a=(a*a)%10;
         b/=2;
      }
      
      System.out.println(c%10);
    
    }
    
  }

}