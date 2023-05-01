class Z72 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new ArithmeticException();
		}
		System.out.println("main end");
	}
}

/*

E:\dec-batch-dev\exception-handling\src>java -cp ../classes Z72
main begin
Exception in thread "main" java.lang.ArithmeticException
        at Z72.main(Z72.java:8)

*/