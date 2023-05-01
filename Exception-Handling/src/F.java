class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		main(null);
		System.out.println("main end");
	}
}

/*
Exception in thread "main" java.lang.StackOverflowError
*/


/*

theory: 

	while executing java program, if any statement or external resourse provides an abnormal condition 
	then either Exception object or Error object raising.
	Raised Exception object or Error object should be handled some how to continue further.
	Otherwise flow terminates.

	10 / 0 ==> ArithmeticException

	int[] x = {1, 50, 40};
	int x = x[6]; =====> ArrayIndexOutOfBoundsException

	String s1 = "hello".substring(90, 100);  ====> StringIndexOutOfBoundsException

	String s1 = null;
	int i = s1.length();  ===> NullPointerException

	String s1 = "abc";
	Integer i = (Integer) s1; =====> ClassCastExeption

	int i = Integer.parseInt("abc"); ====> NumberFormatException

	
	if stack memory is not sufficient, then StackOverFlowError
	if heap memory is not sufficient, then OutOfMemoryError



*/