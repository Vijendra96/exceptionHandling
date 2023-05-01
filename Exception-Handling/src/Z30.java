class Z30 
{
	void test()
	{
		try
		{
			clone();
		}
		catch (CloneNotSupportedException ex)
		{
			System.out.println("from error");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


/*

	Hello World!

*/