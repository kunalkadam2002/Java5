import java.util.*;
class p257{
  public static void main(String args[]){
    String str,s1;
     Scanner sc=new Scanner(System.in);
     str=sc.nextLine();
     StringTokenizer st1=new StringTokenizer(str);
     StringBuffer sb=new StringBuffer(" ");
     while(st1.hasMoreTokens()){
         s1=st1.nextToken();
         sb.insert(0,s1+" ");
    }
    System.out.print(sb);
  }
}