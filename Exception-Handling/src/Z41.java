class Z41
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try begin");
			Class.forName("Z41");
			System.out.println("------------");
			new java.io.FileReader("");
			System.out.println("------------");
			System.out.println("try end");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("CNFE");
		}
		catch (java.io.IOException ex)
		{
			System.out.println("IOE");
		}
		System.out.println("main end");
	}
}

	/*
				try begin
				------------
				IOE
				main end
	*/