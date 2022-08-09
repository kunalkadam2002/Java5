import java.util.*;
class p266{
  public static void main(String args[]){
    String s1,s2,s3;
    char ch;
    int i,j=1;
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
    

    StringTokenizer st1=new StringTokenizer(s1);
     StringBuffer sb;
    while(st1.hasMoreTokens()){
       s2=st1.nextToken();
       sb=new StringBuffer(s2);
       sb.reverse();
       System.out.print(sb);
       for(i=0;i<s2.length();i++){
         ch=charAt(i);
         
         if(ch=='a' ||ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' || ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U'){  
                 sb.setCharAt(i,j);
                 j++;
                 
         }
      }
      System.out.print(sb);
       
       
    }
  }
}