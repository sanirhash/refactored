interface A
{
	void test();
}

class M5 
{
	public static void main(String[] args) 
	{
		A a1 = () -> System.out.println("from test");			
		
		a1.test();
		System.out.println("done");
	}
}

//() -> System.out.println("from test");	is a lambda expression

//lambda expressions are only for single method interfaces
//	-> denotes that implementation is about to start
//if only one method is there in an interface, lambda expression allows us to implement that method directly, even without its name

//lambda expressions are only for the functional interfaces(single method interface) purpose

//marker interface: interface without any members