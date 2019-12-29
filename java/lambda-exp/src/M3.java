interface A
{
	void test();
}

class M3 
{
	public static void main(String[] args) 
	{
		class B implements A			//B is a local inner class; visibility limited to main()
		{
			public void test()
			{
				System.out.println("from test");
			}
		}
		B b1 = new B();
		b1.test();
		System.out.println("---------");
		B b2 = new B();
		b2.test();
		System.out.println("---------");
	}
}
