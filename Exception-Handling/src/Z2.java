class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("try body");
			return;
		}
		try
		{
			System.out.println("try");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch body");
		}
		finally
		{
			System.out.println("from  finally");
		}
		System.out.println("main end");
	}
}
/*
main begin
try body
*/