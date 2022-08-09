import java.util.*;
class grosssalary{
   private int id;
   private String name;
   private int bs;
   private float ta,da,hra,gs;
   
   public void getdata(){
     Scanner d1=new Scanner(System.in);
     System.out.println("Enter id=");
     id=d1.nextInt();
     System.out.println("Enter name=");
     name=d1.next();
    System.out.println("Enter basic salary =");
    bs=d1.nextInt();
   }
   public void showdata(){
     System.out.println("Employee id ="+id);
     System.out.println("Employee name ="+name);
     System.out.println("Employee basic salary ="+bs);
     System.out.println("Ta ="+ta);
     System.out.println("Da ="+da);
     System.out.println("Hra ="+hra);
      System.out.println("Gross salary ="+gs);
   }
  public void calculate(){
     ta=bs*5/100;
     da=bs*10/100;
     hra=bs*15/100;
     gs=ta+da+hra+gs;
  }
   
}
class p283{
   public static void main(String args[]){
     grosssalary s1=new grosssalary();
     System.out.println("Enter employee info");
     s1.getdata();
     s1.calculate();
     System.out.println("Employee info is :");
     s1.showdata();
   }
}