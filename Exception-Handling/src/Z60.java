class A
{
	A() throws ClassNotFoundException
	{

	}
}

class Z60 extends A 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println("done");
	}
}

//compilation error


/*

Z60.java:9: error: unreported exception ClassNotFoundException in default constructor
class Z60 extends A
^
1 error

*/