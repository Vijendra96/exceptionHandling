class Z21
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("exception occured");
		}
		System.out.println("done");
	}
}
/*
exception occured
done
*/