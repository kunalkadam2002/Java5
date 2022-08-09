import java.util.*;
class Student{
   private int roll;
   private String name;
   private String depart;
   public void getdata(){
      Scanner d1=new Scanner(System.in);
      System.out.println("Enter roll no :");
       roll=d1.nextInt();
       System.out.println("Enter name :");
       name=d1.next();
       System.out.println("Enter department :");
       depart=d1.next();
   }
   public void show(){
      System.out.println(roll+"\t"+name+"\t"+depart);
   }
   public String getdepart(){
       return depart;
   }
}
class p286{
      public static void main(String args[]){
	int i;
                
	Student s1[];
	s1=new Student[5];
	for(i=0;i<s1.length;i++){
	   s1[i]=new Student();
	}
	System.out.println("Enter Student info :");
	for(i=0;i<s1.length;i++){
	    s1[i].getdata();
	}
	System.out.println("Student Info :");
	for(i=0;i<s1.length;i++){
	    s1[i].show();
 	}
	
	for(i=0;i<s1.length;i++){
	   if(s1[i].getdepart()=="comp"){
	      s1[i].show();
	  }
	}
      }

}