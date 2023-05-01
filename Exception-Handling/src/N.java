class N 
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
		catch (NumberFormatException ex)
		{
			System.out.println("NumberFormatException occured");
		}
		System.out.println("main end");
	}
}
/*

E:\dec-batch-dev\exception-handling\src>javac -d ../classes N.java

E:\dec-batch-dev\exception-handling\src>java -cp ../classes N abc
main begin
try begin
NumberFormatException occured
main end

E:\dec-batch-dev\exception-handling\src>java -cp ../classes N 9
main begin
try begin
1
ArithmeticException occured
main end

E:\dec-batch-dev\exception-handling\src>java -cp ../classes N 10
main begin
try begin
1
2
try end
main end

*/