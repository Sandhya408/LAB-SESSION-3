class Divide
 {
int div(int a,int b)throws ArithmeticException;
public static void main(String a[])
 {
try{
 int n1=Integer.parseInt(a[0]);
 int n2=Integer.parseInt(a[1]);
 System.out.println("Result="+n1/n2);
  }catch(ArrayIndexoutofBoundsException be)
  {
 System.out.println("Arguement is missing");
 catch(NumberFormatException ne)
 {
System.out.println("InvalidArguement");
 }catch(ArithmeticException ae)
 {
System.out.println("Second number zero Invalid");
 }
finally{
 System.out.println("program-end");
}
}
}