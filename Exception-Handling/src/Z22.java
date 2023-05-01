class Z22
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("Z22");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("exception occured");
		}
		System.out.println("done");
	}
}

/* 
done
*/