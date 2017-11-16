import static java.lang.Math.sqrt;
import java.util.Scanner;
class MaximalQuadrilateralArea
{
    public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
       int t;
       t=s.nextInt();
       while(t>0)
       {
            double a,b,c,d;
            double area,s1;
            a=s.nextDouble();
            b=s.nextDouble();      
            c=s.nextDouble();
            d=s.nextDouble();
            s1=(a+b+c+d)/2; 
      area=  sqrt((s1-a)*(s1-b)*(s1-c)*(s1-d)) ; 
         System.out.println(area);
         t--;
      }
   }


}