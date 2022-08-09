import java.util.*;
class Student{
   public int roll;
   public String name;
   public float per;
  
  public void getdata(){
    Scanner d1=new Scanner(System.in);
    System.out.println("Enter Roll no =");
    roll=d1.nextInt();
    System.out.println("Enter name =");
    name=d1.next();
    System.out.println("Enter percentage =");
    per=d1.nextFloat();
  }
  public void showdata(){
   System.out.println("Roll no ="+roll);
   System.out.println("Name ="+name);
   System.out.println("Percentage ="+per);
  }
}
class p282{
  public static void main(String args[]){
      Student s1=new Student();
     
      s1.getdata();
      System.out.println("Student Info :");
      s1.showdata();
  }
}