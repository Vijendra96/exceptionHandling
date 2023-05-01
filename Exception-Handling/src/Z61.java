class A
{
	A() throws ClassNotFoundException
	{

	}
}

class Z61 extends A 
{
	Z61() throws ClassNotFoundException
	{
		System.out.println("from Z61()");
	}
	public static void main(String[] args)  
	{
		System.out.println("done");
	}
}

/*

done

*/