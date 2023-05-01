class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch body");
		}
		System.out.println("main end");
	}
}
/*
main begin
try begin
catch body
main end
*/


/*

theory points:

	1.  inside a try block we can develop any number of statement and any type of statement.
		mainly keep obnormal condition statement.

	2.	catch block should be immediately after try block.
		catch block should take one argument of Throwable type
		Throwable is a super class to all Exception classes and Error classes.

	3.	if Exception/Error object raising inside a try, then it will try to handle through a catch block
		if it is compatable. Otherwise flow terminates.

	4.	inside a try, if Exception/Error occured, then remainig portion of the try will not be executing.

*/