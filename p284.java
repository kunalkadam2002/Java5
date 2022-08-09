import java.util.*;
class student{
  private int roll;
  private String name;
  private float per;
  public void getdata(){
    Scanner d1=new Scanner(System.in);
    System.out.println("Enter Roll no =");
    roll=d1.nextInt();
    System.out.println("Enter name =");
    name=d1.next();
    System.out.println("Enter percentage=");
    per=d1.nextInt();
  }
  public void showdata(){
    System.out.println(roll+"\t"+name+"\t"+per);
  }
}
class p284{
   public static void main(String args[]){
     int i;
     student s1[];
     s1=new student[5];
      for(i=0;i<s1.length;i++){
          s1[i]=new student();
      }
     System.out.println("enter student info :");
     for(i=0;i<s1.length;i++){
         s1[i].getdata();
     }  
     System.out.println("__________________");
     for(i=0;i<s1.length;i++){
         s1[i].showdata();
     }  
  }
}