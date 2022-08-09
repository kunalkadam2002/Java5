import java.util.*;
class p251{
  public static void main(String args[])
  throws Exception{
  int i,cnt=0; 
  String s1;
  char ch;
  Scanner d1=new Scanner(System.in);
  System.out.print("enter a string :");
  s1=d1.nextLine();
  System.out.print("enter character to be searched :");
  ch=(char)System.in.read();
    for(i=0;i<s1.length();i++){
       if(s1.charAt(i)==ch){
          cnt++;
       }
     }
   if(cnt==0)
      System.out.print("character is not available");
   else 
      System.out.print("character is available "+cnt+" times");
   }
}