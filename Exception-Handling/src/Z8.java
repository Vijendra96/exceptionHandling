class Z8 
{
	public static void main(String[] args) 
	{
		try
		{
			int m = 10 / 0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("1st catch");
			int i = 30;
		}
		catch(ArithmeticException ex1)
		{
			int k = 50;
			System.out.println("2nd catch");
		}
	}
}

/*
	compilation error

*/