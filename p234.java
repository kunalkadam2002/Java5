import java.util.*;
class p234{
   public static void main(String args[]){
   int i,j;
   int a[][]=new int[3][5];
   int sum[]=new int[5];
   Scanner d1=new Scanner(System.in);
   for(i=0;i<a.length;i++){
      for(j=0;j<a[i].length;j++){
            a[i][j]=d1.nextInt();
       }
     }
    for(i=0;i<sum.length;i++){
        sum[i]=0;
        for(j=0;j<a.length;j++){
                sum[i]=sum[i]+a[j][i];
             
        }
    }
   
   for(i=0;i<a.length;i++){
        for(j=0;j<a[i].length;j++){
           System.out.print(" "+a[i][j]);
        }
        System.out.print("\n");
   }
   for(i=0;i<sum.length;i++){
        System.out.print(" "+sum[i]);
   }
  
   }
}