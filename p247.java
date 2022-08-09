import java.util.*;
class p247{
   public static void main(String args[]){
    int i,cnt=0;
    String s1; 
    Scanner d1=new Scanner(System.in);
    System.out.print("enter a string :");
    s1=d1.nextLine();
    for(i=0;i<s1.length();i++){
       if(s1.charAt(i)>=97 && s1.charAt(i)<=122){
	cnt++;
      }
    }
    System.out.print("No of small letters in the string :"+cnt);
  }
}