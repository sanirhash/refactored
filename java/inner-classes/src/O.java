class O 
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
		//i = 10;		//java:11: error: local variables referenced from an inner class must be final or effectively final
		System.out.println("done");
	}
}


//j cannot be modified in class A as it is final
//so it can be used inside A