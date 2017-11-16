// Problem URL : http://www.spoj.com/problems/ABSYS/

import java.util.Scanner;
class AntiBlotSystem
{
    public static void main(String[] args)
    {
        String str,s1,s2,s3,t; int test;
        Scanner s=new Scanner(System.in);
        t=s.nextLine();
         test= Integer.parseInt(t.trim());
        for(int c=0;c<test;c++)
        {  
            str=s.nextLine();
              while(str.isEmpty())
              {
               str=s.nextLine();   
              }
        int i,i1=0,i2=0,i3=0;           
          String[] p =str.split(" [+] ");
          String[] p1=p[1].split(" [=] ");
 
         if( p[0].indexOf("m")>=0)
         { 
         
             i2= Integer.parseInt(p1[0].trim());
             i3= Integer.parseInt(p1[1].trim());
             i1=i3-i2;
         }   
         if(p1[0].indexOf("m")>=0)
         {
          i1= Integer.parseInt(p[0].trim());
          i3= Integer.parseInt(p1[1].trim());
          i2=i3-i1;
    
         }
             
         if(p1[1].indexOf("m")>=0)
         {
          i1= Integer.parseInt(p[0].trim());
          i2= Integer.parseInt(p1[0].trim()); 
          i3=i1+i2;

         }
       System.out.println(i1+" + "+i2+" = "+i3);
      
    }
    
    }
}