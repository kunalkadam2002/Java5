import java.util.*;
class Student{
   private int roll;
   private String name;
   private float per;
   public void getdata(){
     Scanner d1=new Scanner(System.in);
     System.out.println("enter roll :");
     roll=d1.nextInt(); 
     System.out.println("enter name :");
     name=d1.next();
     System.out.println("enter percentage :");
     per=d1.nextFloat();
   }
  public void show(){
    System.out.println(roll+"\t"+name+"\t"+per);    
   }
  public float getpercent(){
      return per;
  }
}
class p285{ 
   public static void main(String args[]){
     int i;
     float max;
     Student s1[];
     s1=new Student[5];
     for(i=0;i<s1.length;i++){
        s1[i]=new Student();
     }
     System.out.println("Enter student info");
     for(i=0;i<s1.length;i++){
         s1[i].getdata();
     }
     System.out.println("Student info ");
     System.out.println("Roll no  Name  Percentage");
     System.out.println("---------------------------------");
     for(i=0;i<s1.length;i++){
         s1[i].show();
     }
     max=s1[0].getpercent();
     for(i=0;i<s1.length;i++){
        s1[i].getpercent();
        if(s1[i].getpercent()>max){
                  max=s1[i].getpercent();
	   s1[i].show();        
       }
            
     }
     
   }
 }

