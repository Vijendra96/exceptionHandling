class A
{
	void test() throws Throwable
	{
		System.out.println("A-test()");
	}
}
class Z68 extends A 
{
	//try overriding test with diff throws class
	void test() 
	{
		System.out.println("Z68-test()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A ref  = new Z68();
		try
		{
			ref.test();
		}
		catch (Throwable ex)
		{
			System.out.println("some exception");
		}
		System.out.println("main end");
	}
}

/*

main begin
Z68-test()
main end

*/