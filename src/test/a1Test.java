package test;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.a1;
import code.book;

class a1Test {

	@Test
	void req1Test() {
		a1 cart =new a1();
		assertTrue(cart.product_count==0);
	}
	
	@Test
	void req2Test() {
		a1 cart =new a1();
		book JavaBook =new book(127,"Java Book");
		cart.addBook(JavaBook);
		assertTrue(cart.product_count==1 && cart.total_value_of_cart==127);
	}
	
	@Test
	void req3Test() {
		a1 cart =new a1();
		book JavaBook =new book(127,"Java Book");
		cart.addBook(JavaBook);
		
		book Web =new book (100,"Web design Book");
		cart.addBook(Web);
		assertTrue(cart.product_count==2 && cart.total_value_of_cart==227);
	}

}
