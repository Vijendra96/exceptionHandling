class Z74
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			if (true)
			{
				throw new ArithmeticException("something went wrong");
			}
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}

/*

main begin
try begin
java.lang.ArithmeticException: something went wrong
        at Z74.main(Z74.java:11)
main end

*/