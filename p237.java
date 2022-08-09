import java.util.*;
class p237{
    public static void main(String ars[]){
      int i,j,k,temp;
      int a[][]=new int[3][5];
      Scanner d1=new Scanner(System.in);
        for(i=0;i<a.length;i++){
          for(j=0;j<a[i].length;j++){
            a[i][j]=d1.nextInt();
          }
        } 
       for(i=0;i<a.length;i++){
           for(j=0;j<a[i].length;j++){
	for(k=j+1;k<a[i].length;k++){
	    if(a[i][j]>a[i][k]){
	       temp=a[i][j];
	       a[i][j]=a[i][k];
	       a[i][k]=temp;
	    }
	}
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