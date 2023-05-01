class Z33
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("test1 begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("some exception");
		}
		System.out.println("test1 end");
	}
}
/*
main begin
test1 begin
some exception
test1 end
main end
*/
