interface A
{
	public static void test()
	{
		System.out.println("from test");
	}
}
class M20
{
	public static void main(String[] args) 
	{
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("----------");
	}
}


//from jdk1.8 onwards, we can use concrete static methods in an interface