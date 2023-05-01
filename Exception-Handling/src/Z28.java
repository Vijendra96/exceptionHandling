class Z28
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			boolean b1 = true;
		}
		catch (InterruptedException ex)
		{
			System.out.println("some exception");
		}
		System.out.println("main end");
	}
}

/*

	InterruptedException required atleast one interrupted statement in try

*/