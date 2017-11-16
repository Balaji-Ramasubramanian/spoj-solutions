// Problem URL : http://www.spoj.com/problems/EGYPIZZA/

import static java.lang.Math.ceil;
import java.util.Scanner;
class Pizza
{
    public static void main(String[] args)
    {
        int n;int qc=0,hc=0,tc=0;
        double sum=1;
        String a[]=new String[100000];
        Scanner s=new Scanner(System.in);
        double ah[]=new double[10000];
          double aq[]=new double[10000];
            double at[]=new double[10000];
        String h="1/2",q="1/4",t="3/4";
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=s.next();
            if(a[i].equals(h))
            {
               ah[hc++]=.50; 
            }
            else if(a[i].equals(q))
            {
               aq[ qc++]=.25;
            }
            else if(a[i].equals(t))
            {  at[tc++]=.75;
            }
        }
        for(int i=0;i<tc;i++)
        {
            sum+=at[i]+aq[i];
            sum=ceil(sum);
        }
        for(int i=tc;i<qc;i++)
        {
            sum+=aq[i];
        }
        for(int i=0;i<hc;i++)
        {
            sum+=ah[i];
        }
        System.out.println((int)ceil(sum));
        }
}