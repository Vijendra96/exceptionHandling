class A
{
	A() throws ClassNotFoundException
	{

	}
}

class Z58
{
	public static void main(String[] args) 
	{
		try
		{
			A a1 = new A();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("done");
	}
}

/*

	done

*/