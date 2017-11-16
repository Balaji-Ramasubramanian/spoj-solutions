//Problem URL : http://www.spoj.com/submit/MAXLN/

import java.util.Scanner;
class TheMaxLines
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      double r;
      int t;
      t=s.nextInt();
      for(int c=0;c<t;c++)
      {
          r=s.nextDouble();
          System.out.println("Case "+(c+1)+": "+(4*r*r+.25));
      }
    }
}
