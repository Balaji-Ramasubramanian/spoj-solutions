//Problem URL: http://www.spoj.com/problems/CIRCLE_E/

import java.lang.Math;
import java.util.Scanner;
class ThreeCircleProblem_EASY
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t;
        t=s.nextInt();
      
        while(t>0)
        {
            double a,b,c,d,e,f,r;
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            d=a*b*c;
            e=a*b+b*c+c*a;
            f=a*b*c*(a+b+c);
            r=d/(e+2*Math.sqrt(f));
            System.out.println(r);
            t--;
        }
    }
}