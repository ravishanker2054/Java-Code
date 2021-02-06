class AI
{
 public static void main(String args[])
 {
   int n=Integer.parseInt(args[0]);
   int a[]=new int[n];
   try
   {
     a[10]=100;
	 System.out.println("value is:"+a[10]);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
     System.out.println("ArrayIndexOutOfBounds");  
   }
 }
}