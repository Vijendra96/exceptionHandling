class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try body begin");
			int i = 10 / 0;
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

main begin
try body begin
catch body
main end

*/