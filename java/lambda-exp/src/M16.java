import java.util.ArrayList;
import java.util.function.Consumer;
class M16  
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(990);
		list1.add(1000);
		list1.add(678);
		list1.add(45);
		list1.add(3452);
		ListConsumer consumer = new ListConsumer();
		list1.forEach(consumer);	//forEach() taking each object from list1 and calling accept() of consumer
	}
}
class ListConsumer implements Consumer<Integer>
{
	public void accept(Integer obj)
	{
		System.out.println("consuming: " + obj);
	}
}