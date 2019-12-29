class H 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}

//while using an inner class for data-type, it can be used like outer.inner(like H.B or H.C)
//inner class may be static or non-static