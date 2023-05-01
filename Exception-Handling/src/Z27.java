class Z27 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
			System.out.println("some exception");
		}
		System.out.println("main end");
	}
}

/*
main begin
main end (after delay of 10 seccond)
*/