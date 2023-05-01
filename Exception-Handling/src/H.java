class H
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
		catch (NullPointerException ex)
		{
			System.out.println("catch body");
		}
		System.out.println("main end");
	}
}
/*
becouse of incompatable, flow teminating
*/

/*

main begin
try begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at H.main(H.java:9)

*/