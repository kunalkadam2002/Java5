import java.util.*;
class p240{
   public static void main(String args[]){
       int i,j;
       Scanner d1=new Scanner(System.in);
       int a[][]=new int[3][3];
       int b[][]=new int[3][3];
       for(i=0;i<a.length;i++){
           for(j=0;j<a[i].length;j++){
	a[i][j]=d1.nextInt();
           }
       }
     for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
               b[j][i]=a[i][j];
         }

     }
     for(i=0;i<a.length;i++){
           for(j=0;j<a[i].length;j++){
	System.out.print(" "+b[i][j]);
           }
          System.out.print("\n");
       }
 
   }
}