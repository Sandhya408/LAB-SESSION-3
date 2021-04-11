class Callme
 {
void call()
 {
System.out.println(" {Hi ");
try
 {
Thread.sleep(500);
 }catch(InterruptedExpection ie)
 {}
System.out.println("}");
 }
 }
class caller implements Runnable
 {
Callme target;
Thread t;
caller(Callme target)
 {
this.target=target;
t=new Thread(this);
t.start();
 }
public void run()
 {
target.call();
 }
class Sdemo1
 {
public static void main(String a[])
 {
 Callme target=new Callme();
 caller c1=new caller(target);
 caller c2=new caller(target);
 caller c3=new caller(target);
}
}



