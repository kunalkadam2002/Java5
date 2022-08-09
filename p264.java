import java.util.*;
class p264{
  public static void main(String args[])
    throws Exception{
    String s1,s2;
    char ch;
    int i,cnt=0;
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
    ch=(char)System.in.read();
    StringTokenizer st1=new StringTokenizer(s1);
    while(st1.hasMoreTokens()){
      s2=st1.nextToken();
      for(i=0;i<s2.length();i++){
      if(ch==s2.charAt(i)){
              cnt++;    
              System.out.println("char is present at position :"+i);    
          }     
      }
    }
    if(cnt==0)
       System.out.print("char is not present ");
    else 
        System.out.println("char is present "+cnt+"times ");
     
  }
}