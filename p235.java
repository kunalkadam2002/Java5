import java.util.*;
class p235{
   public static void main(String args[]){
     int i ,j;
     int max;
     Scanner d1=new Scanner(System.in);
     int a[][]=new int[3][5];
      for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
            a[i][j]=d1.nextInt();
         }  
      }
     
     for(i=0;i<a.length;i++){
         max=a[i][0];
         for(j=0;j<a[i].length;j++){
            System.out.print(" "+a[i][j]);
            if(a[i][j]>max){
                max=a[i][j];
            }
         }
         System.out.print("="+max);
         System.out.print("\n");
     }
     
    }
}