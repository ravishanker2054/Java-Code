class AE
{
 public static void main(String args[])
 {
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   try
   {
     int c=a/b;
	 System.out.println("c is:"+c);
   }
   catch(ArithmeticException e)
   {
     System.out.println("Division By Zero");  
   }
 }
}