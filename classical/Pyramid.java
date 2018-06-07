// Problem URL = http://www.spoj.com/problems/PIR/

import static java.lang.Math.*;
import java.util.*;

class Pyramid{
    
    public static void main(String [] args){
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0){
            double s1,s2,s3,s4,s5,s6;
            double volume,v1,v2,v3,v4;
            s1 = sc.nextDouble();
            s2 = sc.nextDouble();
            s3 = sc.nextDouble();
            s4 = sc.nextDouble();
            s5 = sc.nextDouble();
            s6 = sc.nextDouble();
            v1 = pow(s3*s4,2)*(pow(s5,2)+pow(s6,2)+pow(s1,2)+pow(s2,2)-pow(s3,2)-pow(s4,2));
            v2 = pow(s5*s2,2)*(pow(s3,2)+pow(s6,2)+pow(s1,2)+pow(s4,2)-pow(s5,2)-pow(s2,2));
            v3 = pow(s6*s1,2)*(pow(s3,2)+pow(s5,2)+pow(s4,2)+pow(s2,2)-pow(s6,2)-pow(s1,2));
            v4 = -pow(s3*s5*s1,2)-pow(s5*s6*s4,2)-pow(s3*s6*s2,2)-pow(s1*s4*s2,2);
            volume = sqrt((v1+v2+v3+v4)/144);
            System.out.println((double)Math.round(volume*10000)/10000);
            t--;
        }
    }
    
}