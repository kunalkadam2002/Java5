import java.util.*;
class p239{
   public static void main(String args[]){
     int i,j,k,temp;
     Scanner d1=new Scanner(System.in);
     int a[][]=new int[3][5];
     for(i=0;i<a.length;i++){
       for(j=0;j<a[i].length;j++){
          a[i][j]=d1.nextInt();
        }
     }
     for(i=0;i<a.length;i++){
          for(j=0,k=a[i].length-1;j<a[i].length/2;j++,k--){
	temp=a[i][j];
	a[i][j]=a[i][k];
	a[i][k]=temp;
          }

     }
     for(i=0;i<a.length;i++){
       for(j=0;j<a[i].length;j++){
          System.out.print(" "+a[i][j]);
        }
        System.out.print("\n");
     }
   }
}