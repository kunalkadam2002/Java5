class Rectangle{
  int len;
  int wid;
  public void setlw(int x,int y){
      len=x;
      wid=y;
  }
  public void showlw(){
     System.out.println("Length :"+len); 
     System.out.println("Width :"+wid);
  } 
  public void swapp(Rectangle m){
     int a;
     a=len;
     len=m.len;
     m.len=a;
    
     a=wid;
     wid=m.wid;
     m.wid=a;
  }

}
class p287{
  public static void main(String args[]){
     Rectangle r1,r2;
     r1=new Rectangle();
     r2=new Rectangle();
 
     r1.setlw(10,20);
     r2.setlw(15,35);
     System.out.println("Object r1 :");
     r1.showlw();
    System.out.println("Object r2 :");
     r2.showlw();
   
    r1.swapp(r2);
    System.out.println("Object 1 after swapping :");
     r1.showlw();
    System.out.println("Object 2 after swapping :");
     r2.showlw();
    
   
    
  }
}