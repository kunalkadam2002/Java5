import java.util.*;
class p236{
   public static void main(String args[]){
     int i,j,min;
     int a[][]=new int[3][5];
     Scanner d1=new Scanner(System.in);
        for(i=0;i<a.length;i++){
          for(j=0;j<a[i].length;j++){
            a[i][j]=d1.nextInt();
          }
       }
      for(i=0;i<a.length;i++){
           min=a[i][0];
          for(j=0;j<a[i].length;j++){
            System.out.print(" "+a[i][j]);
             if(a[i][j]<min){
 	 min=a[i][j];
             }
          }
         System.out.print("="+min);
         System.out.print("\n");
       }
    
   }
}