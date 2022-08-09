import java.util.*;
class p261{
   public static void main(String args[]){
     String s1,s2,s3;
     char a[];
     int i=0;
     int j;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter  2 strings :");
     s1=sc.nextLine();
     s2=sc.nextLine();
     s1=s1+s2;
     a=new char[s1.length()];
     StringTokenizer st1=new StringTokenizer(s1);
     while(st1.hasMoreTokens()){
         s3=st1.nextToken();
         j=0;
         while(j<s3.length()){
              a[i++]=s3.charAt(j++);
       }
       System.out.print(a);
     }
      
   }
}