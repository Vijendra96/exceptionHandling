class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try body begin");
			int i = 10 / 0;
			System.out.println("try body end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			int j = 20 / 0;
			System.out.println("catch end");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*
	E:\dec-batch-dev\exception-handling\src>java -cp ../classes T
	main begin
	try body begin
	catch begin
	from finally
	Exception in thread "main" java.lang.ArithmeticException: / by zero
			at T.main(T.java:15)
*/