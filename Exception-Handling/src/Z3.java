class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try");
			return;
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
try
from  finally

*/