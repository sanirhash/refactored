interface A
{
	void test();
}

class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new A()			
		{
			public void test()
			{
				System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("done");
	}
}

//By deining a subclass to A, we are creating an annonymous inner class A
//only one object can be created
//If u r looking for only one object creation go for annonymous inner class
//a1 is pointing to an object of subclass of A
