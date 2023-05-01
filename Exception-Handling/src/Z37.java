class Z37
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	static void test1() throws ClassNotFoundException 
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
}

/*

main begin
test1 begin
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:375)
        at Z37.test1(Z37.java:12)
        at Z37.main(Z37.java:6)


*/