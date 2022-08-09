import java.util.*;
class p258{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str,s1,s2;
    char ch;
    int i,len;
    System.out.print("enter string ");
    str=sc.next();
    StringTokenizer st1=new StringTokenizer(str);
    while(st1.hasMoreTokens()){
       s1=st1.nextToken();
       len=s1.length();
       i=0;
       s2="  ";
       while(len!=0){
         ch=s1.charAt(i++);
         if(s2.indexOf(ch)<0){
              s2=s2+ch;
         }
         len--;
        }
       System.out.print(s2+" ");
    }
  }
}