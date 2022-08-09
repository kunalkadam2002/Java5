class p231{
  public static void main(String args[]){
   int i,j;
   int a[][]={
	  {1,3,4,5},
	   {9,7,5,9,8},
	   {2,4} 
                };
   for(int i[] : a){
      for(int j : a){
           System.out.print(" "+j);
           System.out.print("\n");
      }
     
    }
  }
}