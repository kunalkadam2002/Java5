import java.util.*;
class p248{
  public static void main(String args[]){
    int i;
    String s1;
    Scanner d1=new Scanner(System.in);
    System.out.print("enter a string :");
    s1=d1.nextLine();
    for(i=s1.length()-1;i>=0;i--){
      System.out.print(s1.charAt(i));  
    }
  }
}