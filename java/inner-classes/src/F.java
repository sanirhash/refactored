class F 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new F().new B();	//create an F object; using that create a B object
		C c1 = new C();
		System.out.println("done");
	}
}
