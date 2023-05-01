class Z25 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("some error");
		}
		System.out.println("done");
	}
}

/*

some error
done

*/

/*
		minimum one Class.forName(""); is required.
*/