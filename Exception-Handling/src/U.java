class U 
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
			try
			{
				System.out.println("catch-try begin");
				int j = 20 / 0;
				System.out.println("catch-try end");
			}
			catch (ArithmeticException ex1)
			{
				System.out.println("catch inside a catch");	
			}
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}
/*
main begin
try body begin
catch begin
catch-try begin
catch inside a catch
catch end
main end
*/