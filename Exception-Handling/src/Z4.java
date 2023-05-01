class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try");
			int i = 10 / 0;
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
main begin
try
catch body
from  finally
*/