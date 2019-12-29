interface A
{
	void test1();			//public is optional for the members of an interface, as they are by default public
								//all abstract methods in an interface, are non-static, as abstract and static cannot go together

	default void test2()		
	{										//default implementations are by default inherited to the subclasses
		System.out.println("from A.test2");
	}
}
class B implements A
{
	public void test1()
	{
		System.out.println("from B.test1");
	}
}
class C implements A
{
	public void test1()
	{
		System.out.println("from C.test1");
	}
}
class D implements A
{
	public void test1()
	{
		System.out.println("from D.test1");
	}
}
class M23
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		C c1 = new C();
		c1.test1();
		D d1 = new D();
		d1.test1();
		d1.test2();
		//A.test2();	//error: non-static method test2() cannot be referenced from a static context
		System.out.println("done");
	}
}

//default keyword can be used for non-static concrete methods developed in an interface