class Z32
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 begin");
	}

}

/*


Z32.java:12: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("");
                             ^
1 error

*/