import java.util.*;
class p252{
   public static void main(String args[]){
    int i,j=0;
    String s1,s2,s3;
    Scanner d1=new Scanner(System.in);
    System.out.print("enter string 1:");
    s1=d1.nextLine();
    System.out.print("enter string to be searched:");
    s2=d1.nextLine();
    int a=s1.length();
    int b=s2.length();
    if(b>a){
      System.out.print("String is not available");
    }
    for(i=0;(i+b)<=s1.length();i++){
       s3=s1.substring(i,b+i);
        if(s2.equals(s3)){
	j++;
        }
     }
    if(j==0) 
      System.out.print("String is not available");
    else
       System.out.print("String is available at pos "+j);
  }
}