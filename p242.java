import java.util.*;
class p242{
   public static void main(String args[]){
      int i,j,sum,k;
      int a[][]=new int[3][3];
      int b[][]=new int[3][3];
      int c[][]=new int[3][3];
      Scanner d1=new Scanner(System.in);
      System.out.println("enter 1st matrix :");
      for(i=0;i<a.length;i++){
          for(j=0;j<a[i].length;j++){
               a[i][j]=d1.nextInt();
          }
      }
      System.out.println("enter 2nd matrix :");
     for(i=0;i<a.length;i++){
          for(j=0;j<a[i].length;j++){
               b[i][j]=d1.nextInt();
          }
      }
    
    for(i=0;i<a.length;i++){
        for(j=0;j<a[i].length;j++){
	sum=0;
            for(k=0;k<a.length;k++){
	sum=sum+(a[i][k]*b[k][i]);
            }
           c[i][j]=sum;
        }
    }
   for(i=0;i<c.length;i++){
          for(j=0;j<c[i].length;j++){
               System.out.print(" "+c[i][j]);
          }
          System.out.print("\n");
      }
 }
}