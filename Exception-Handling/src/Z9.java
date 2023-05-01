class Z9 
{
	public static void main(String[] args) 
	{
		try
		{
			int m = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("1st catch");
			int i = 30;
		}
		finally 
		{

		}
		catch (NullPointerException ex1)
		{
			int k = 50;
			System.out.println("2nd catch");
		}
	}
}

/*
/*
compilation error
becouse of catch is not after finally it will come immediatly after try
*/
*/

/*
E:\ExeptionHandling\src>javac -d ../classes H.java
H.java:18: error: 'catch' without 'try'
                catch (NullPointerException ex1)
                ^
1 error

*/