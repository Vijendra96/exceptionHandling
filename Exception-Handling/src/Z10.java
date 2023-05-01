class Z10 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*
try begin
from finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z10.main(Z10.java:8)
*/