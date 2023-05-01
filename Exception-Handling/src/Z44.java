class Z44
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("try begin");
			Class.forName("Z42");
			System.out.println("------------");
			new java.io.FileReader("Z42.java");
			System.out.println("------------");
			System.out.println("try end");
		}
		catch (Exception ex)
		{
			System.out.println("some exception");
		}
		System.out.println("main end");
	}
}

/*

try begin
------------
------------
try end
main end

*/