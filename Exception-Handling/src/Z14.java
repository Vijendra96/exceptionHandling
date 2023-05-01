class Z14 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int[] elements = new int[999999999];
			System.out.println("try end");
		}
		catch (OutOfMemoryError err)
		{
			System.out.println("error object");
		}
		System.out.println("main end");
	}
}


/*

main begin
try begin
error object
main end

*/