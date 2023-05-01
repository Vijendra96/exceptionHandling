class A
{
	A() throws ClassNotFoundException
	{

	}
}

class Z57 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("done");
	}
}

/*

Z57.java:13: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                A a1 = new A();
                       ^
1 error

*/