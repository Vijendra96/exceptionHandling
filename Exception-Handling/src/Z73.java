class Z73 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new ArithmeticException("something went wrong");
		}
		System.out.println("main end");
	}
}

/*

main begin
Exception in thread "main" java.lang.ArithmeticException: something went wrong
        at Z73.main(Z73.java:8)

*/