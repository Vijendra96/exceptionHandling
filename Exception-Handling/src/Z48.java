class Z48 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;
		}
		catch (ArithmeticException t)
		{
			System.out.println("ArithmeticException");
		}
		catch (RuntimeException t)
		{
			System.out.println("RuntimeException");
		}
		catch (Exception t)
		{
			System.out.println("Exception");
		}
		catch (Throwable t)
		{
			System.out.println("Throwable");
		}
		System.out.println("main end");
	}
}
/*
main begin
ArithmeticException
main end
*/