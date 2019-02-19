package code;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class a1 {

	public static int product_count ;
	public static int total_value_of_cart;
	public static LinkedList<book> books;
	
	
	public a1()
	{
		product_count=0;
		total_value_of_cart=0;
		 books = new LinkedList<book>(); 
	}
	
	
	
	public static void addBook(book b)
	{
		books.add(b);
		
		product_count++;
		total_value_of_cart+=b.unit_price;
	}
}
