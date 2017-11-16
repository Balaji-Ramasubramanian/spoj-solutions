// Problem URL : http://www.spoj.com/problems/ENIGMATH/

import java.util.Scanner;
class PlayWithMath
{
   public static void main(String[] args)
   {
       int a,b,x,y,t;
       Scanner s=new Scanner(System.in);
       t=s.nextInt();
       while(t>0)
       {
         a=s.nextInt();
         b=s.nextInt();
         x=b;
         y=a;    
      
          while (b > 0)
          {
              int temp = b;
              b = a % b; 
              a = temp;
          }
          if(x%a!=0 && y%a!=0)
             System.out.println(a+" "+b);
          else
             System.out.println(x/a+" "+y/a);
         t--;
       }
   }
}