import java.util.*;
class p249{
  public static void main(String args[]){
    int i;
    char ch;
    String s1,s2="";
    Scanner d1=new Scanner(System.in);
    System.out.print("enter a string :");
    s1=d1.nextLine();
    for(i=s1.length()-1;i>=0;i--){
       ch=s1.charAt(i);
       s2=s2+ch;
    }
     System.out.println(s2);
    if(s1.equals(s2))
      System.out.println("string is palindrome");
    else
       System.out.println("string is not palindrome");
   
  }
}