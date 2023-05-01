class Z55 
{
	Z55() throws ClassNotFoundException
	{

	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Z55 obj = new Z55();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
/*

main begin
main end

*/