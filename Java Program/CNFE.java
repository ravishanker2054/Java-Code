class CNFE
{
 public static void main(String args[])
 {
   try
   {
	 Class.forName("dog");
         System.out.println("ClassFound");

   }
   catch(ClassNotFoundException e)
   {
     System.out.println("ClassNotFound");  
   }
 }
}