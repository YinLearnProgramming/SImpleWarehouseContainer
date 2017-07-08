/**
 * YinHang Kwok
 * warehouse question
 * this is a class for create a doublelinklist
 * 7/8/2017
 */
import java.util.Date;

public class ShippingContainer 
{
	public static void main(String[] args)
	{
		DoublyLinkedList order = new DoublyLinkedList();
		Date d = new Date();
		
		order.add(new Item("AVG123", "1001123489764563", 5, new Date(117, 7, 8)));
		order.add(new Item("NOD123", "1001123489764563", 6, new Date(117, 7, 8)));
		
		System.out.println(order.search("AVG123"));
		order.update("AVG123", 2);
		System.out.println(order.search("AVG123"));
	}
}
