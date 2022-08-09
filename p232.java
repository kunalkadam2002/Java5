import java.util.*;
class p232{
    public static void main(String args[]){
      Scanner d1=new Scanner(System.in);
      int a[][];
      int i,j;
       a=new int[3][];
      a[0]=new int[3];
      a[1]=new int[5];
      a[2]=new int[2];
      
     System.out.print("enter a jagged array :");
     for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
              a[i][j]=d1.nextInt();
        }
    }
    System.out.println("jagged array :");
    for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
             System.out.print(" "+a[i][j]);
        } 
      System.out.print("\n");
   }
  }
}