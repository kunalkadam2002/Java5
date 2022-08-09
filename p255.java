import java.util.*;
class p255{
  public static void main(String args[]){
     String str,s1;
      char ch;
     Scanner d1=new Scanner(System.in);
     str=d1.nextLine();
     StringTokenizer st1=new StringTokenizer(str);
     StringBuffer sb;
     while(st1.hasMoreTokens()){
        s1=st1.nextToken();
        sb=new StringBuffer(s1);
        ch=s1.charAt(0);
        sb.setCharAt(0,s1.charAt(s1.length()-1));
        sb.setCharAt(s1.length()-1,ch);
        System.out.print(sb+" ");
        
     }
  }
}