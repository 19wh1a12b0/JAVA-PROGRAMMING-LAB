class A implements Runnable
{
public void run()
{
for (int i=0;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}


class ThreadbyRunnable
{
public static void main(String args[])
{
A a = new A();
Thread t1 = new Thread (a, "BVRITH");
Thread t2 = new Thread (a, "IT");
Thread t3 = new Thread (a, "Second year");
t1.start();
t2.start();
t3.start();

System.out.println("Hello");
}
}
