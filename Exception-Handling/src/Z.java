class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		try
		{
			i = 15;
		}
		catch (ArithmeticException ex)
		{
			 i = 20;
		}
		System.out.println("main end : " + i);
	}
}

/*
main begin
main end : 15
*/