class Y 
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
			int j = 20;
		}
		System.out.println("main end : " + j);
		System.out.println("main end : " + ex);
	}
}

/*
	local members of catch, can't use outside the catch
*/