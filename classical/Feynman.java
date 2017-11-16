// Problem URL : http://www.spoj.com/problems/SAMER08F/

import java.util.Scanner;
class Feyman
{
    public static void main(String[] args)
    {
        int n,sum;
        Scanner s=new Scanner(System.in);
          n=s.nextInt();
       while (n!=0)
        { 
            sum=0;
            for(int i=1;i<=n;i++)
            {
                sum+=i*i;
            }
            System.out.println(sum);
            n=s.nextInt();
        }
    }
}