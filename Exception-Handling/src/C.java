class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] x = {10, 20, 30}; 
		int i = x[6];
		System.out.println("main end");
	}
}
/*

main begin
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 3
        at C.main(C.java:7)

*/