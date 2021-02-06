class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("\t from thread A:i="+i);
		}
		
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("\t from thread B:i="+i);
		}
		
	}
}

class runnable
{
	public static void main(String args[])
	{
		A a =new A();
		B b =new B();
		Thread X =new Thread(a);
		Thread Y =new Thread(b);
		X.start();		
        Y.start();
	}
}