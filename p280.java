import java.util.*;
class Rectangle{
      private int len;
      private int wid;
      
     public void getlw(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rectangle len :"+len); 
        len=sc.nextInt();
         System.out.println("Enter Rectangle width:"+wid);
         wid=sc.nextInt();
     }
    public void showlw(){
       System.out.println(" Rectangle len :"+len);
        System.out.println("Rectangle width :"+wid);
    }

}
class p280{
   public static void main(String args[]){
     Rectangle r1;
     r1=new Rectangle();
      System.out.println("Enter Rectangle info :");
      r1.getlw();
       System.out.print("Rectangle info :");   
       r1.showlw();

   }
}