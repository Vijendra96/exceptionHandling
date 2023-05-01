class A
{
	A() throws ClassNotFoundException
	{

	}
}

class Z62 extends A 
{
	Z62() 
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
	public static void main(String[] args)  
	{
		System.out.println("done");
	}
}

/*

								compilation erroe
								super() should be the first statement


Z62.java:15: error: call to super must be first statement in constructor
                        super();
                             ^
1 error

*/