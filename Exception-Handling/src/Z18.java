class Z18 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("pls command one command line args");
			return;
		}
		int i = Integer.parseInt(args[0]); 
		test(i);
	}
	static void test(int i)
	{
		System.out.println("Test() : " + i);
		if (i == 0)
		{
			return;
		}
		i--;
		test(i);
	}
}


/*

E:\lara-java-dev\dec-batch-dev\exceptionHandling\src>java -cp ../classes Z18 14
Test() : 14
Test() : 13
Test() : 12
Test() : 11
Test() : 10
Test() : 9
Test() : 8
Test() : 7
Test() : 6
Test() : 5
Test() : 4
Test() : 3
Test() : 2
Test() : 1
Test() : 0

*/