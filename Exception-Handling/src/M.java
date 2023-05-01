class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length == 0)
		{
			System.out.println("pls enter one command line argument");
			return;
		}
		try
		{
			System.out.println("try begin");
			String s1 = args[0];
			int i = Integer.parseInt(s1);
			System.out.println(1);
			int j = i / (i - 9);
			System.out.println(2);
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ArithmeticException occured");
		}
		System.out.println("main end");
	}
}

/*

E:\dec-batch-dev\exception-handling\src>javac -d ../classes M.java

E:\dec-batch-dev\exception-handling\src>java -cp ../classes M abc
main begin
try begin
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at M.main(M.java:15)

E:\dec-batch-dev\exception-handling\src>java -cp ../classes M 9
main begin
try begin
1
ArithmeticException occured
main end

E:\dec-batch-dev\exception-handling\src>java -cp ../classes M 18
main begin
try begin
1
2
try end
main end

*/