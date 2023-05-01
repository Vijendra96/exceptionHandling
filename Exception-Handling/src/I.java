class I 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (ArithmeticException ex)
		{
		}
		try
		{
			
		}
		catch (NullPointerException ex)
		{
		}
		System.out.println("done");
	}
}

/* output: done */

/*
		1.  try can be empty (only in the unchecked).
		2.  catch can be empty.
		3.  catch always shuld take minimum one argument.(more than one allowed from JDK1.8 with a | symbol)
*/
