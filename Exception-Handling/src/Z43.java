class Z43
{
	public static void main(String[] args)
	{
		System.out.println("try begin");
		Class.forName("Z42");
		System.out.println("------------");
		new java.io.FileReader("Z42.java");
		System.out.println("------------");
		System.out.println("try end");
		System.out.println("main end");
	}
}
/*
Z43.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("Z42");
                             ^
Z43.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                new java.io.FileReader("Z42.java");
                ^
2 errors
*/