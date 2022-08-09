import java.util.*;
class p267{
   public static void main(String args[]){
     String s1;
     Scanner sc=new Scanner(System.in);
     int i,j;
     int count[]={0,0,0,0,0};
     int count1=0;
     char ch;
     char v[]={'a','e','i','o','u'};
     System.out.print("enter string :");
     s1=sc.nextLine();
      for(i=0;i<s1.length();i++){
          ch=s1.charAt(i);
         if(ch=='a' ||ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' || ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U'){               
                 count1++;                 
         }
      }
     System.out.print("count of vowels :"+count1);
      for(i=0;i<s1.length();i++){
          ch=s1.charAt(i);
          for(j=0;j<v.length;j++){
                if(ch==v[j]){
	  count[j]++;
	}
          }
      }

    for(j=0;j<v.length;j++){
       if(count[j]!=0)
             System.out.println(v[j]+"="+count[j]);
    }
   }
}