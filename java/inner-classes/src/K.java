class K 
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}

//3rd type of inner class: Local Inner Class
//developing a class inside a method body
//it is a local class(similar to a local variable)
//A will be visible only within the main() method