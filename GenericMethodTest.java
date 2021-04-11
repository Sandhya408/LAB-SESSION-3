public class GenericMethodTest
 {
 public static <E> void printArray( E[] inputArray)
 {
 for(E element : inputArray)
 {
 System.out.println(element);
 }
 }
public static <E> void print(E e1)
 {
 System.out.println(e1);
 }
public static void main(String args[])
 {
  Integer[] intArray = { 1,2,3,4,5 };
  Double[] doubleArray = { 1.1,2.2, 3.3,4.4 };
  Character[] charArray = { 'W','O','R','L','D' };
  System.out.println("Array integerArray contains:");
  printArray(intArray);
  System.out.println("£nArray doubleArray contains:");
  printArray(doubleArray);
  System.out.println("£nArray characterArray contains:");
  printArray(charArray);
 int i1=10;
 print(i1);
 Float f1=10.5f;
 print(f1);
 String s="WORLD";
 print(s);
 }
}