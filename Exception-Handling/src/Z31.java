class Z31 
{
	void test()
	{
		try
		{
			System.out.println("try");
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

Z31.java:9: error: exception CloneNotSupportedException is never thrown in body of corresponding try statement
                catch (CloneNotSupportedException ex)
                ^
1 error

*/