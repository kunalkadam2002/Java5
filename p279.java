class Rectangle{
    private int len;
    private int wid;
    public void setlw(int x,int y){
       len=x;
       wid=y;
    }
   public void showlw(){
       System.out.println("Rectangle length :"+len);
        System.out.println("Rectangle width :"+wid);
   }
   public int area(){
      int a=len*wid;
       return a;
   }
}
class p279{
   public static void main(String args[]){
    int a;
    Rectangle r1;
    r1=new Rectangle();
    r1.setlw(10,20);
    System.out.println("Rectangle info :"); 
    r1.showlw();
    a=r1.area();
     System.out.println("Rectangle area :"+a);
  } 
}