/**
 * YinHang Kwok
 * warehouse question
 * this is a class for create a doublelinklist
 * 7/8/2017
 */
public class DoublyLinkedList 
{
	private Item first;
	private int size;
	
	public DoublyLinkedList()
	{
		first = null;
		size = 0;
	}
	
	public boolean isEmpty() //check empty
	{
		return first == null;
	}
	
	public void add(Item i)// add item into the list
	{
		if(first==null)
		{
			first = i;
		}
		else
		{
			i.setNext(first);
			first.setPrev(i);
		}
		size++;
	}
	
	public void remove(String id)
	{
		Item temp = first;
		
		 while(temp != null)
		 {
			if(temp.getItemSKU().equals(id))//found item.
			{
				if(temp.getPrev() == null)//the item is the first
				{
					first = first.getNext();
					first.setPrev(null);
				}
				else
				{
					temp.getPrev().setNext(temp.getNext());
		            if(temp.getNext() != null)
		            {
		            	temp.getNext().setPrev(temp.getPrev());
		            }
				}
			}
			temp.getNext(); 
		 }
	}
	
	public Item search (String id)
	{
		 Item temp = first;
		 while(temp != null)
		 {
			 if(temp.getItemSKU().equals(id))
			 {
				 return temp;
		     }
			 else
			 {
				 temp = temp.getNext();
			 }
		 }
		 System.out.println("Cannot find!");
	     return null;
	}
	
	public void update(String id, int q)
	{
		Item temp = first;
		while(temp !=null)
		{
			if(temp.getItemSKU().equals(id))
			{
				temp.setQuantity(q);
			}
			temp = temp.getNext();
		}
	}
}
