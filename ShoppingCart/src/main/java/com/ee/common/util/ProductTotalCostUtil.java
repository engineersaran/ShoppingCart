package com.ee.common.util;

import java.math.BigDecimal;
import java.util.List;

import com.ee.products.Product;

/**
 * A utility class to perform total cost calculation for each products added in
 * shopping cart.
 */
public class ProductTotalCostUtil {

	/**
	 * A utility method to calculate the total price amount of each products added in
	 * shopping cart
	 * 
	 * @param shoppingCartBasket
	 *            List<Product>
	 * @return Formatted totalProductPrice BigDecimal
	 */
	public static BigDecimal getTotalProductPrice(List<Product> shoppingCartBasket) {

		double result = 0;
		for (Product products : shoppingCartBasket) {
			result += products.getUnitPrice();
		}
		return FormatUtils.performDecimalFormat(result);
	}
}
