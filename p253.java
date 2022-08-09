class p253{
  public static void main(String args[]){
    StringBuffer sb=new StringBuffer("Object oriented");
    System.out.println("String s1 ="+sb);
    sb.append(" Programming language");
    System.out.println("String s2 ="+sb);
    sb.insert(15, " java");
    System.out.println("String s3 ="+sb);
    sb.setCharAt(20,'-');
    System.out.println("String s4 ="+sb);
    sb.setLength(6);
    System.out.println("String s5 ="+sb);
    sb.reverse();
    System.out.println("String s6 ="+sb); 
 } 

}