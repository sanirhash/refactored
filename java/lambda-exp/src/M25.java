interface A
{
	default void test()
	{
		System.out.println("from A ==> test");
	}
}
interface B
{
	default void test()
	{
		System.out.println("from B ==> test");
	}
}
class C implements A, B	
{
	public void test()		//The default methods got overrided; so no error
	{
		System.out.println("from C ==> test"); 
	}
}
class M25 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test();
		System.out.println("done");
	}
}
