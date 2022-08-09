import java.util.*;
class p233{
   public static void main(String args[]){
     int i,j;
     int sum[]=new int[5];
     Scanner d1=new Scanner(System.in);
     int a[][]=new int[3][5];
     for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
	a[i][j]=d1.nextInt();
         }
    }
  
    for(i=0;i<a.length;i++){
       sum[i]=0;
      for(j=0;j<a[i].length;j++){
           System.out.print(" "+a[i][j]);
           sum[i]=sum[i]+a[i][j];
      }
      System.out.print(" "+sum[i]);
     System.out.print("\n");
    }

   }
}