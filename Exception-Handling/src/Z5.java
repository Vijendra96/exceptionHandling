class Z5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			System.exit(9);
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch body");
			return;
		}
		finally
		{
			System.out.println("from  finally");
		}
		System.out.println("main end");
	}
}
/*
		program instantly terminated at line numer 9.

*/
/*

main begin
try begin

*/