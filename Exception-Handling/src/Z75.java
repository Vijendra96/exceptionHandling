// throw statement int he catch body then it is called as a re-throw

class Z75
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
			throw new ArithmeticException("something went wrong");  //re-throw
		}
		System.out.println("main end");
	}
}
/*

E:\dec-batch-dev\exception-handling\src>java -cp ../classes Z75
main begin
try begin
java.lang.ArithmeticException: / by zero
        at Z75.main(Z75.java:11)
Exception in thread "main" java.lang.ArithmeticException: something went wrong
        at Z75.main(Z75.java:17)
*/