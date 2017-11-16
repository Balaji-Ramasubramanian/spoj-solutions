// Problem URL : http://www.spoj.com/problems/GIRLSNBS/

import java.util.Scanner;
class GirlsAndBoys
{
    public static void main(String[] args)
    {
        float g,b;
        float r;
        Scanner s=new Scanner(System.in);
        g=s.nextInt();
        b=s.nextInt();
        while(g!=-1 || b!=-1)
        {
            if(g>b)
               System.out.println((int)Math.ceil((g/(b+1.0))));
            else
                System.out.println((int)Math.ceil(b/(g+1)));
             g=s.nextInt();
             b=s.nextInt();
        }
    }
}