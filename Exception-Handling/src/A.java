class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		System.out.println("main end");
	}
}


/*

main begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.main(A.java:6)

*/