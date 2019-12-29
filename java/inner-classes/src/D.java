class D 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new B();		//error: non-static variable this cannot be referenced from a static context
		C c1 = new C();
		System.out.println("done");
	}
}

//we cannot do object creation of B inside static main() method using a referece variable of B