// Problem URL : http://www.spoj.com/problems/CRDS/

import java.util.Scanner;
class pyramid
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      long total,l,c,an;
     
      for(int i=0;i<t;i++)
      { 
          total=0;
           l=s.nextLong();
           an=3+(l-1)*3;
           total=(an+3)*l/2-l;
          System.out.println(total%1000007);
      }
              
    }
}
