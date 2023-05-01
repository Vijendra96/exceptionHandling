class Z34
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	static void test1() throws ClassNotFoundException 
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
}

/*
	1. throws is only for checked exception without try/catch.
	
	getting compilation error at line number 6 not line number 12.

*/