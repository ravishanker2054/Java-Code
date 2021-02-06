class samp
{
	void display()
	{
		
		System.out.println("hello");
	}
	
}

class NPE
{
 public static void main(String args[])
 {
   samp s=null;
   try
   {
    s.display();
   }
   catch(NullPointerException e)
   {
    System.out.println("NullPointerException");
   }
 }
 }