// Problem URL : http://www.spoj.com/problems/ANARC09A/

import static java.lang.Math.ceil;
import java.util.Scanner;
import java.util.Stack;
class Seinfeld
{
    public static void main(String[] args)
    { int count=1;
       String ch;
       Scanner s=new Scanner(System.in);
       Stack st=new Stack();
       ch=s.next();
       while(ch.charAt(0)!='-')
    {  int i;
        float c=0,c1=0;
       for(i=0;i<ch.length();i++)
       {
         if(ch.charAt(i)=='{')
         {
             st.push(1);
         }
         else
         {  if(st.isEmpty()==false)
             st.pop();
            else
              c++;
         }
       }
       while(st.isEmpty()==false)
       {
           st.pop();
           c1++;
       }
        System.out.println(count +". "+ (int)(ceil(c/2)+ceil(c1/2)));
      st.empty();
      ch=s.next();
      count++;
      
   }
    }
}