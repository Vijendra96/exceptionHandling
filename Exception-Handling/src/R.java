class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		try
		{
			System.out.println("try body");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from exception");
		}
		finally 
		{
			System.out.println("from finally block");
		}
		System.out.println("main end");
	}
}

/*
		main begin
		Exception in thread "main" java.lang.ArithmeticException: / by zero
				at R.main(R.java:6)
*/