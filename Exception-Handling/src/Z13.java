class Z13 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements = new int[999999999];
		System.out.println("main end");
	}
}


/*

E:\lara-java-dev\dec-batch-dev\exceptionHandling\src>java -cp ../classes Z13
main begin
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at Z13.main(Z13.java:6)


*/