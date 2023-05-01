class Z12 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			main(args);
		}
		catch (StackOverflowError err)
		{
			System.out.println("error object");
		}
		
		System.out.println("main end");
	}
}

/*
	1. any Throwable type can be handled with try/catch.
	2. Error is a subclass to Throwable.
	3. StackOverflowError is a subclass to Error.
	4. All type of Error can be handled with try/catch.
	5. if abnormal condition is due to java statement, then Exception object will be raised.
	6. if abnormal condition is due to an external resources, then Error object will be raised.
*/