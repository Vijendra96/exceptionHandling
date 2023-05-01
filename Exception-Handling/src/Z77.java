class Z77
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
			throw new AgeNegativeException("age should be greater than or equal to zero");
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

E:\lara-java-dev\dec-batch-dev\exceptionHandling\src>java -cp ../classes Z77 10
main begin
main end
continue.......
continue.......
continue.......
continue.......
continue.......
continue.......
main end

E:\lara-java-dev\dec-batch-dev\exceptionHandling\src>java -cp ../classes Z77 0
main begin
main end
Exception in thread "main" AgeNegativeException: age should be greater than or equal to zero
        at Z77.main(Z77.java:15)


*/