class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = "abc".substring(5, 10);
		System.out.println("main end");
	}
}

/*

main begin
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 5, end 10, length 3
        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4601)
        at java.base/java.lang.String.substring(String.java:2704)
        at B.main(B.java:6)


*/