import java.util.*;
class p260{
   public static void main(String args[]){
     String s1,s2;
     Scanner d1=new Scanner(System.in);
     s1=d1.next();
     s2=d1.next();
     StringBuffer sb=new StringBuffer(s1);
     System.out.print(s1);
     sb.append(s2);
    
     System.out.print(s2);
   
   }
}