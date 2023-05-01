class Z45
{
	public static void main(String[] args) throws ClassNotFoundException, java.io.IOException
	{
		System.out.println("try begin");
		Class.forName("Z42");
		System.out.println("------------");
		new java.io.FileReader("Z42.java");
		System.out.println("------------");
		System.out.println("try end");
		System.out.println("main end");
	}
}
/*

try begin
------------
------------
try end
main end

*/