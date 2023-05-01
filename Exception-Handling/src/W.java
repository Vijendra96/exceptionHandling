class W 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try body begin");
			try
			{
				int i = 10 / 0;
			}
			catch (ArithmeticException ex)
			{
				System.out.println("ex");
			}
			System.out.println("some thing more");
			System.out.println("try body end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch body");
		}
		System.out.println("main end");
	}
}

/*
	inside a try we can keep try/catch to handle the exception instantly and continueing further in the outer try.
*/






/*
main begin
try body begin
ex
some thing more
try body end
main end
*/