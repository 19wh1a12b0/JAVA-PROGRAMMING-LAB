class A extends Thread
{
public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("Threads");
}
}
}

class B extends Thread
{

public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("MultiClass");
}
}
}

class C extends Thread
{

public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("Strings");
}
}
}


class MultiClassFromThread
{
public static void main(String args[])
{
A a = new A();
B b = new B();
C c = new C();
a.start();
b.start();
c.start();
System.out.println("Java Programming lab");
}
}