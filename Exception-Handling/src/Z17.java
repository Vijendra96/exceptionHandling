class Z17 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("pls command one command line args");
			return;
		}
		int i = Integer.parseInt(args[0]); 
		int k = i / (i - 9);
		System.out.println(k);
	}
}
