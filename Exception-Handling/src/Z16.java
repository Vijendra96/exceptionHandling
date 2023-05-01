class Z16 
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
		catch (NoSuchMethodError err)
		{
			System.out.println("from error");
		}
		System.out.println("main end");
	}
}


/*


Z16.java:9: error: cannot find symbol
                        Test.main(args);
                            ^
  symbol:   method main(String[])
  location: class Test
1 error


*/