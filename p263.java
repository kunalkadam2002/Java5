import java.util.*;
class p263{
    public static void main(String args[]){
      String s1,s3;
      char a[];
      char ch;
      int i,j;
      Scanner d1=new Scanner(System.in);
      s1=d1.nextLine(); 
      a=new char[s1.length()];
      a=s1.toCharArray();
      StringTokenizer st1=new StringTokenizer(s1);
      while(st1.hasMoreTokens()){
       s3=st1.nextToken();
       a=s3.toCharArray();
      for(i=0;i<a.length;i++){
          for(j=i+1;j<a.length;j++){
             if(a[i]>a[j]){
                 ch=a[i];
                 a[i]=a[j];
	  a[j]=ch;
            }
          }
      }
      System.out.println(a);
    }  
    }
}