class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		try
		{
			System.out.println("try body");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("from exception");
		}
		System.out.println("main end");
	}
}
/*
		main begin
		Exception in thread "main" java.lang.ArithmeticException: / by zero
				at Q.main(Q.java:6)

*/

/*
		1.  catch is responsible to handle the Exception/Error objects which are occuring inside a try body.
		2.  catch is not handling an Exception/Error objects which are occuring before try block.
*/