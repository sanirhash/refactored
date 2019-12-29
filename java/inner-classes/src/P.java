class P 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		A a1 = new A();
		a1.test();
		//i = 20;		//java:11: error: local variables referenced from an inner class must be final or effectively final
		a1.test();
		System.out.println("done");
	}
}