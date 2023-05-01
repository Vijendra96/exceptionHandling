class Z47 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;
		}
		catch (Throwable t)
		{
			System.out.println("Throwable");
		}
		catch (Exception t)
		{
			System.out.println("Exception");
		}
		catch (RuntimeException t)
		{
			System.out.println("RuntimeException");
		}
		catch (ArithmeticException t)
		{
			System.out.println("ArithmeticException");
		}
		System.out.println("main end");
	}
}

/*

Z47.java:14: error: exception Exception has already been caught
                catch (Exception t)
                ^
Z47.java:18: error: exception RuntimeException has already been caught
                catch (RuntimeException t)
                ^
Z47.java:22: error: exception ArithmeticException has already been caught
                catch (ArithmeticException t)
                ^
3 errors

*/
