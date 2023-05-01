class Z54 
{
	Z54() throws ClassNotFoundException
	{

	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Z54 obj = new Z54();
		System.out.println("main end");
	}
}

/*

compilation error


Z54.java:10: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Z54 obj = new Z54();
                          ^
1 error
*/