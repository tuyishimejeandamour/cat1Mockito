package com.example.test1;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class ShoppingCartTest {

	ShoppingCart cart;
	  // before tests setUp method  cart  equals newshoppingCart() object
		@Before
		public void setUp(){
		    cart = new ShoppingCart();
		}

		// testing adding one item to cart apple item is  added to cart.
		// assertEquals checks cart  for apple item on list
		@Test
		public void addOneItemToCart() {
			Items item = new Items("apple",2.0);
		    cart.addToCart(item);
		    assertEquals(cart.doesContain(item),(true));
		  
		}
		// testing adding two items to cart apple and Orange item is  added to cart.
		// assertEquals checks cart  for apple item on list and Orange item and total items are 2
		@Test
		public void addTwoItemsToCart(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("orange",2.0);
		    cart.addToCart(item);
		    cart.addToCart(item1);
		    assertEquals(cart.doesContain(item1),(true));
		    assertEquals(cart.doesContain(item1),(true));
		 
		}
	
		@Test
		public void addAnItemTwice(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("apple",2.0);
		    cart.addToCart(item1);
		    cart.addToCart(item);
		    assertEquals(1,cart.getTotalItems());
		   
		   
		}
	   // test case checks for apple item and cart contains specific price is  1.0
		@Test
		public void checkOutOneItem(){
			Items item = new Items("apple",1.0);
		    cart.addToCart(item);
		    assertEquals(1.0,cart.getTotal());
		    
		}
		 // test case checks for two items and cart contains specific  price is 1.60
		@Test
		public void checkoutTwoSeparateItems(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("orange",3.0);
		    cart.addToCart(item);
		    cart.addToCart(item1);
		    assertEquals(5.0,cart.getTotal());
		  
		}
		
		@Test
		public void checkoutTwoSameItems(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("apple",2.0);
			
			assertEquals(4.0,cart.getTotal());
		   
		}
	
		@Test
		public void checkoutThreeItems(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("apple",2.0);
			Items item2 = new Items("apple",2.0);
			Items item3 = new Items("apple",2.0);
		    cart.addToCart(item);
		    cart.addToCart(item1);
		    cart.addToCart(item2);
		    cart.addToCart(item3);
		    
		    assertEquals(8.0,cart.getTotal());
		    
		}

	
		
		@Test 
		public void removeItem(){
			Items item = new Items("apple",2.0);
			Items item1 = new Items("orange",3.0);
			cart.addToCart(item);
			cart.addToCart(item1);
			
		    cart.removeToCart(item1);
		    assertEquals(2.0,cart.getTotal());
		    assertEquals(1,cart.getTotalItems());
		    
		}

  
	
}