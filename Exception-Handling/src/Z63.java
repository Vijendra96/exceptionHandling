/*
	find out all the ways of overriding test method with different throws
*/
class A
{
	void test() 
	{
		System.out.println("from A-test");
	}
}
class Z63 extends A 
{
	void test() 
	{
		System.out.println("Z63 from A-test");
	}
	public static void main(String[] args) 
	{
		Z63 ref = new Z63();
		ref.test();
		System.out.println("Hello World!");
	}
}
 /*
		any method can be overrided without a throws
 */