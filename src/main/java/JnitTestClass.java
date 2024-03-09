import static org.junit.Assert.*;

import org.junit.Test;

import example.Product;

public class JnitTestClass {

	@Test
	public void test() {
		
		Product apple = new Product("りんご",150);
		assertEquals(150,apple.price);
	}

}
