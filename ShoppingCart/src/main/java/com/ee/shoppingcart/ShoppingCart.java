package com.ee.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ee.common.util.ProductTaxAmountUtil;
import com.ee.common.util.ProductTotalCostUtil;
import com.ee.products.Product;

/**
 * A Shopping Cart class where user can add products to cart and total price
 * (inclusive of tax) of it is calculated.
 */
public class ShoppingCart {

	private List<Product> shoppingCartBasket = null;

	private BigDecimal totalShoppingCartPrice = null;

	private BigDecimal totalShoppingCartTaxprice = null;

	public ShoppingCart() {
		shoppingCartBasket = new ArrayList<Product>();
		totalShoppingCartPrice = new BigDecimal(0);
		totalShoppingCartTaxprice = new BigDecimal(0);
	}

	/**
	 * Adds product to the Shopping cart.
	 * @param product Products
	 */
	public void addToCart(Product product) {
		shoppingCartBasket.add(product);
		setTotalShoppingCartPrice();
		setTotalShoppingCartTaxprice();
	}

	/**
	 * calculate and set the total price of the products added in shopping cart to
	 * totalShoppingCartPrice variable
	 */
	private void setTotalShoppingCartPrice() {
		totalShoppingCartPrice = ProductTotalCostUtil.getTotalProductPrice(getShoppingCartBasket());
	}

	/**
	 * calculate and set the total tax price of the products added in shopping cart
	 * to totalShoppingCartTaxprice variable
	 */
	private void setTotalShoppingCartTaxprice() {
		totalShoppingCartTaxprice = ProductTaxAmountUtil.getTotalProductTaxPrice(getShoppingCartBasket());
	}

	/**
	 * Calculates the formatted(2 decimal places)total price(inclusive of tax
	 * amount) of products added in the basket.
	 * 
	 * @return Formatted total price BigDecimal
	 */
	public BigDecimal getTotalPriceForDisplay() {
		return getTotalShoppingCartPrice().add(getTotalShoppingCartTaxprice());
	}

	/**
	 * Returns the list of products added in basket.
	 * 
	 * @return shoppingCartBasket List<Products>
	 */
	public List<Product> getShoppingCartBasket() {
		return shoppingCartBasket;
	}

	/**
	 * Return the total price amount of the products added in shopping cart.
	 * 
	 * @return Formatted total price BigDecimal
	 */
	public BigDecimal getTotalShoppingCartPrice() {
		return totalShoppingCartPrice;
	}

	/**
	 * Return the total tax amount of the products added in shopping cart.
	 * 
	 * @return Formatted total tax price BigDecimal
	 */
	public BigDecimal getTotalShoppingCartTaxprice() {
		return totalShoppingCartTaxprice;
	}
}
