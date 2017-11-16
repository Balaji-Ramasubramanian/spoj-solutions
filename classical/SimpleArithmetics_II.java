// Problem URL : http://www.spoj.com/problems/ARITH2/

import java.util.Scanner;
class SimpleArithmetics_II
{
    public static void main(String[] args)
    {
        try
        {String a;
        long x=0,y=0,t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt(); 
       
        for(int c=0;c<t;c++)
        {
            a=s.next();
          
            while((a.charAt(a.length()-1)!='='))
            {
               a = a + s.next();
            }
            a=a.replace("+"," + ");
            a=a.replace("-"," - ");
            a=a.replace("*"," * ");
            a=a.replace("/"," / ");
            a=a.replace("="," = ");
          x=0; y=0;
          String ch[]= a.split("\\s+");
          x=Integer.parseInt(ch[0]);
      
        for(int i=1;i<ch.length;i++)
        {   
            switch(ch[i].charAt(0))
            { 
                case '+':                 
                     y=Integer.parseInt(ch[++i]);
                     x+=y;break;
                case '-':
                    y=Integer.parseInt(ch[++i]);
                    x-=y;break;
                case '*':
                    y=Integer.parseInt(ch[++i]);
                    x*=y; break;
                case '/':
                    y=Integer.parseInt(ch[++i]);
                    x/=y; break;
                case '=':
                    break;
               
            }            
        }  
         System.out.println(x);  
      }      
   
    }
    catch(Exception e)
       {  
       }
    }
}