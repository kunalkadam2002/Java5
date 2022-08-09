import java.util.*;
class p262{
  public static void main(String args[]){
     String s1,s2;
     int i,j;      
     Scanner d1=new Scanner(System.in);
     s1=d1.nextLine();
     StringTokenizer st1=new StringTokenizer(s1);
     while(st1.hasMoreTokens()){
         s2=st1.nextToken();
        for(i=0;i<s2.length();i++){
            for(j=0;j<=i;j++){
 	 System.out.print(s2.charAt(j)); 
            }
            System.out.println("\n");
        }
        for(i=s1.length()-2;i>=0;i--){
             for(j=0;j<=i;j++){
	System.out.print(s2.charAt(j));
              }
               System.out.println("\n");
         }
     }
   
   }
}