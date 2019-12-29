import java.util.ArrayList;
import java.util.function.Consumer;
class M18  
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(990);
		list1.add(1000);
		list1.add(678);
		list1.add(45);
		list1.add(3452);
		//ListConsumer consumer = new ListConsumer();
		list1.forEach((element) -> System.out.println("consuming: " + element));					
	}
}
