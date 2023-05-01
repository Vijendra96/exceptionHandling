class Z26 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread.sleep(1000);
		System.out.println("main end");
	}
}


//	try/catch  with an InterruptedException is required

/*

U.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);
                            ^
*/