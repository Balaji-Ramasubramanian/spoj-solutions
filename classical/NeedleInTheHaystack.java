import java.util.*;
class NeedleInTheHaystack
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        String sam=s.nextLine();
   try{
       do
        {
           int c=0;n=Integer.parseInt(sam);
        char su[]=new char[n];
     
        String sub = s.next();
        String str=s.next();
        
     int lastIndex = 0;
     int count = 0;
      int idx = 0;
      while ((idx = str.indexOf(sub, idx)) != -1)
      { 
       
          System.out.println(idx); c++;
          idx = str.indexOf(sub, idx)+1;

      }
      if(c==0)
                System.out.println();
      s.nextLine();
       sam=s.nextLine();
        }while((sam)!=null);
    }
   catch(Exception e)
   {
      
   }
}
}
