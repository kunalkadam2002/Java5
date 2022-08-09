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
  public void sum(Rectangle m,Rectangle n){
     int a;
     len=m.len+n.len;
     wid=m.wid+n.wid;
  }

}
class p288{
  public static void main(String args[]){
     Rectangle r1,r2,r3;
     r1=new Rectangle();
     r2=new Rectangle();
     r3=new Rectangle();
     r1.setlw(10,20);
     r2.setlw(15,35);
     System.out.println("Object r1 :");
     r1.showlw();
    System.out.println("Object r2 :");
     r2.showlw();
   
    r3.sum(r1,r2);
    System.out.println("Object addition :");
     r3.showlw();
    
    
  }
}