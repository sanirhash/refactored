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
class C implements A, B		//CTE: ambiguity
{
}							// error: class C inherits unrelated defaults for test() from types A and B
class M24 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
