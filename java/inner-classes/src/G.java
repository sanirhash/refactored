class G 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new G().new B();	//create an G object; using that create a B object
		C c1 = new G.C();
		System.out.println("done");
	}
}

//As C is static(i.e a class member), it can be referred inside a static using the class name