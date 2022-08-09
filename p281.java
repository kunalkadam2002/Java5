class Student{
   private int roll;
   private String name;
   private float per;
   public void setrn(int x,String y,float z){
     roll=x;
     name=y;
     per=z;
  }
  public void showrn(){
    System.out.println("Roll no ="+roll);
    System.out.println("Name  ="+name);
    System.out.println("percentage ="+per);
   
  }

}
class p281{
   public static void main(String args[]){
     Student s1=new Student();
     s1.setrn(100,"kunal",60.97f);
     System.out.println("Student info :");
     s1.showrn();
    
     

   }
}