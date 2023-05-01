class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch body begin");
			System.exit(0);
			System.out.println("catch body end");
		}
		finally
		{
			System.out.println("from  finally");
		}
		System.out.println("main end");
	}
}


/*
	finally block not executing if Systrm.exit(0) executes before

*/
/*
main begin
try begin
catch body begin
*/