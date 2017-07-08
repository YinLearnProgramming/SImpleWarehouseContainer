/**
 * YinHang Kwok
 * warehouse question
 * this is a class for item
 * 7/8/2017
 */
import java.util.*;

public class Item 
{
	private String sku;
	private String upcCode;
	private Date expirationDate;
	private Item next, prev;
	int quantity;
	
	public Item(String id, String code, int q, Date eD)
	{
		sku = id;
		upcCode = code;
		quantity = q;
		expirationDate = eD;
		next = null;
	    prev = null;
	}
	
	public void setQuantity(int q)
	{
		quantity = q;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setNext(Item n)
	{
		next = n;
	}
	
	public void setPrev(Item p)
	{
		prev = p;
	}
	
	public Item getNext()
	{
		return next;
	}
	
	public Item getPrev()
	{
		return prev;
	}
	
	public void setItemSKU (String id)
	{
		sku = id;
	}
	
	public String getItemSKU ()
	{
		return sku;
	}
	
	public void setItemUPCcode(String code)
	{
		upcCode = code;
	}
	
	public String getUPCcode()
	{
		return upcCode;
	}
	
	public Date getDate()
	{
		return expirationDate;
	}
	
	public String toString()
	{
		return ("Item SKU: " + sku + "\nUPC code: " + upcCode + "\nQuantity: " + quantity + "\nExpiration Date: "  + expirationDate);
	}
}
