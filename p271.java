class Rectangle{
     int len;
     int wid;
     void showdata(){
          System.out.println("Rectangle length:"+len);
           System.out.println("Rectangle width :"+wid); 
     }
 
}
class p278{
   public static void main(String args[]){
     int a;
      Rectangle r1;
      r1=new Rectangle();
      r1.len=10;
      r1.wid=20;
      System.out.println("Rectangle info :");
      r1.showdata();
      a=r1.len*r1.wid;
       System.out.print("Area  :"+a);
      
   }
}