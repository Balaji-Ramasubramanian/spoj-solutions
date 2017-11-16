// Problem URL : http://www.spoj.com/problems/CPTTRN6/

import java.util.Scanner;
class CharacterPattern_Act6
{
 public static void main(String[] args)
 {
     int a,b,c,d,t;
     Scanner s=new Scanner(System.in);
     t=s.nextInt();
     while(t>0)
     {
         a=s.nextInt();
         b=s.nextInt();
         c=s.nextInt();
         d=s.nextInt();
         for(int i=1;i<=a+((a+1)*c);i++)
         {
             if(i%(c+1)!=0)
             { 
                  for(int j=1;j<=b+((b+1)*d);j++)
                  {
                  
                   if(j%(d+1)==0)
                   {
                    System.out.print("|");
                    j++;
                   }
                  
                   System.out.print(".");
                  }
                System.out.println("");
             }
            else
              {  
                for(int j=1;j<=b+((b+1)*d);j++)
                 {
                    if(j%(d+1)==0)
                     {
                       System.out.print("+");
                       j++;
                     }
                       System.out.print("-");
                 }
                   System.out.println("");
              }
          }
         --t;
      }
     
 }
}
