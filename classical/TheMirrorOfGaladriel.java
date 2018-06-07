// Problem URL : http://www.spoj.com/problems/AMR12D/

import java.util.Scanner;
import java.util.StringTokenizer;
 
class TheMirrorOfGaladriel
{
   public static void main(String args[])
   {
      String str;
      int i,t,c, length,flag=0;
      Scanner s= new Scanner(System.in);
      t=s.nextInt();
      while(t>0)
      {boolean b=true;
      str = s.next();
      length = str.length();   

    for ( i = 0; i < str.length(); i++) 
    {
        for (int j = i+1; j <= str.length(); j++)
        {
           String rev = new StringBuffer(str.substring(i,j)).reverse().toString();
            if(!str.contains(rev))
            {
                 b=false;
                 break;
            }
                
        }
            break;   
    }  

    if(b==false)
       System.out.println("NO");
    else
       System.out.println("YES");
 
      t--;
      } 
 
   }
}
