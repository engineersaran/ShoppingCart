package com.ee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import com.ee.products.Product;
import com.ee.products.ProductCatalog;
import com.ee.shoppingcart.ShoppingCart;

public class ShoppingCartTest {
	
	private ShoppingCart loadTestData() {
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addToCart(ProductCatalog.getProduct("Dove Soap"));
		shoppingCart.addToCart(ProductCatalog.getProduct("Dove Soap"));
		
		shoppingCart.addToCart(ProductCatalog.getProduct("Axe Deo"));
		shoppingCart.addToCart(ProductCatalog.getProduct("Axe Deo"));
		
		return shoppingCart;
	}
	
	@Test
	public void testShoppingCartSize() {
		
		assertEquals(4, loadTestData().getShoppingCartBasket().size());
	}
	
	@Test
	public void testShoppingCartContentDove() {
		
		List<Product> shoppingCartProductList = loadTestData().getShoppingCartBasket();
		
		for(int i=0;i<2;i++) {
			assertEquals("Dove Soap", shoppingCartProductList.get(i).getProductName());
			assertEquals("39.99", String.valueOf(shoppingCartProductList.get(i).getUnitPrice()));
		}
	}
	@Test
	public void testShoppingCartContentAxe() {
		
		List<Product> shoppingCartProductList = loadTestData().getShoppingCartBasket();
		for(int i=2;i<4;i++) {
			assertEquals("Axe Deo", shoppingCartProductList.get(i).getProductName());
			assertEquals("99.99", String.valueOf(shoppingCartProductList.get(i).getUnitPrice()));
		}
	}

	@Test
	public void testTotalPrice() {
		BigDecimal totalPrice = new BigDecimal("314.96");
		assertThat(totalPrice,  Matchers.comparesEqualTo(loadTestData().getTotalPriceForDisplay()));
	}
	
	@Test
	public void testTotalTax() {
		BigDecimal totalTax = new BigDecimal("35.00");
		assertThat(totalTax,  Matchers.comparesEqualTo(loadTestData().getTotalShoppingCartTaxprice()));
	}
	
}
