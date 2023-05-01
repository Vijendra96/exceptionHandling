class Z42
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
		catch (ClassNotFoundException ex)
		{
			System.out.println("CNFE");
		}
		catch (java.io.IOException ex)
		{
			System.out.println("IOE");
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