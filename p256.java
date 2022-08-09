import java.util.*;
class p256{
  public static void main(String args[]){
     String str,s1;
     Scanner sc=new Scanner(System.in);
     str=sc.nextLine();
     StringTokenizer st1=new StringTokenizer(str);
     StringBuffer sb;
     while(st1.hasMoreTokens()){
          s1=st1.nextToken();
          sb=new StringBuffer(s1);
          sb.reverse();
          System.out.print(sb+" ");
     }
  }
}