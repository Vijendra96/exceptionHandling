class Z36
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test1();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("exception");
		}
		System.out.println("main end");
	}
	static void test1() //throws ClassNotFoundException 
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
}
/*
line number 19 required a try/ catch but line number 8 doesn't require ClassNotFoundException

so there are two compile time error

*/