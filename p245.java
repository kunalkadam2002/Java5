import java.util.*;
class p245{
   public static void main(String args[]){
    int i,cnt=0;
    char ch;
    String s1;
    Scanner d1=new Scanner(System.in);
     System.out.print("enter a string :");
     s1=d1.nextLine();
    for(i=0;i<s1.length();i++){
       ch=s1.charAt(i);
       if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
          cnt++;
       }
   }
  System.out.print("The no of vowels in string are :"+cnt);
   
  }
}