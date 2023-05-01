class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try body begin");
			int i = 10 / 0;
			System.out.println("try body end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			int j = 20 / 0;
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}
/*
E:\dec-batch-dev\exception-handling\src>java -cp ../classes S
main begin
try body begin
catch begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at S.main(S.java:15)

E:\dec-batch-dev\exception-handling\src>
*/