interface A
{
	int test();
}

class M10 
{
	public static void main(String[] args) 
	{
		A a1 = () -> 200;
		int i = a1.test();
		System.out.println("done with: " + i);
	}
}

//if method body containing only return statement, there is no need to use a return keyword