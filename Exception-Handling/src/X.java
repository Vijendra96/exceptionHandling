class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
		}
		catch (ArithmeticException ex)
		{
			i = 20;
		}
		System.out.println("main end : " + i);
	}
}

/*
	local members of try we cna't use outside the try.

*/