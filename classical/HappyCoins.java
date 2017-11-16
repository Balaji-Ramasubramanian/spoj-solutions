import java.util.Scanner;
class HappyCoins
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        int t;
        t=s.nextInt();
      
        while(t>0)
          {
            n=s.nextInt();
            String a[]=new String[n];
          
           for( i=0;i<n;i++)
            {
            a[i]=s.next();
            }
          
           for( j=0;j<n-1;j++)
             {
               if(a[j].equals(a[j+1]))
               {
                 a[j+1]="hhb";
                }
                else
                a[j+1]="lxh";
             }
        
             if(n==1)
                 System.out.println("lxh");
             else
                 System.out.println(a[n-1]);

      t--;
       
        }
    }
}