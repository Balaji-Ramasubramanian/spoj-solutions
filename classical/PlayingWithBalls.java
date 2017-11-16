import java.util.Scanner;
class PlayingWithBalls
{
	public static void main (String[] args) 
	{
		int t,a,b;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		while(t>0)
		{
			a=s.nextInt();
			b=s.nextInt();
	          if(b%2==0)
		         System.out.println("0.000000");
               else
                 System.out.println("1.000000");
             t--;
		}     
	}

}