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
			int[] elements = {10, 20, 30, 40};
			elements[i] = 50;
			System.out.println(3);
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
		finally 
		{
			System.out.println("from finaaly");
		}
		System.out.println("main end");
	}
}
/*
E:\dec-batch-dev\exception-handling\src>javac -d ../classes P.java

E:\dec-batch-dev\exception-handling\src>java -cp ../classes P abc
main begin
try begin
NumberFormatException occured
from finally
main end

E:\dec-batch-dev\exception-handling\src>java -cp ../classes P 9
main begin
try begin
1
ArithmeticException occured
from finally
main end

E:\dec-batch-dev\exception-handling\src>java -cp ../classes P 18
main begin
try begin
1
2
from finally
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 4
        at P.main(P.java:20)

E:\dec-batch-dev\exception-handling\src>java -cp ../classes P 3
main begin
try begin
1
2
3
try end
from finally
main end

E:\dec-batch-dev\exception-handling\src>
*/