class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("\t from thread A:i="+i);
		}
		System.out.println("exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("\t from thread B:i="+i);
		}
		System.out.println("exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("\t from thread C:i="+i);
		}
		System.out.println("exit from C");
	}
}
class thread
{
	public static void main(String args[])
	{
		A a =new A();
		B b =new B();
		C c =new C();
		a.setPriority(Thread.NORM_PRIORITY);
		b.setPriority(a.getPriority()+1);
		c.setPriority(Thread.MIN_PRIORITY);
	    a.start();
		b.start();
		c.start();
	}
}