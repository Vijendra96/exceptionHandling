class Z15 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			Test.main(args);
			System.out.println("try end");
		}
		catch (NoClassDefFoundError err)
		{
			System.out.println("from error");
		}
		System.out.println("main end");
	}
}


/*

Z15.java:9: error: cannot find symbol
                        Test.main(args);
                            ^
  symbol:   method main(String[])
  location: class Test
1 error

*/