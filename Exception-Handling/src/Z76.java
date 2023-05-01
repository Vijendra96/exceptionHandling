class Z76 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length == 0)
		{
			System.out.println("enter one command line args for the age purpose");
			return;
		}
		int age = Integer.parseInt(args[0]);
		System.out.println("main end");
		if (age <= 0)
		{
			throw new ArithmeticException("age should be greater than or equal to zero");
		}
		System.out.println("continue.......");
		System.out.println("continue.......");
		System.out.println("continue.......");
		System.out.println("continue.......");
		System.out.println("continue.......");
		System.out.println("continue.......");
		System.out.println("main end");
	}
}

/*
	E:\dec-batch-dev\exception-handling\src>java -cp ../classes Z76 0
	main begin
	main end
	Exception in thread "main" java.lang.ArithmeticException: age should be greater than or equal to zero
			at Z76.main(Z76.java:15)
*/

/*
	E:\dec-batch-dev\exception-handling\src>java -cp ../classes Z76 10
	main begin
	main end
	continue.......
	continue.......
	continue.......
	continue.......
	continue.......
	continue.......
	main end
*/