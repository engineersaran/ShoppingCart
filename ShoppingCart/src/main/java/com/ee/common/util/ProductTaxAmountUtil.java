package com.ee.common.util;

import java.math.BigDecimal;
import java.util.List;

import com.ee.products.Product;

/**
 * A utility class to perform Product tax amount calculations.
 */
public class ProductTaxAmountUtil {

	/**
	 * A utility method to calculate tax amount of the product added in shopping cart.
	 * @param unitPrice double, taxRate double
	 * @return  taxAmount double
	 */
	public static double getTaxAmount(double unitPrice, double taxRate) {
		return (unitPrice * taxRate) / 100;
	}
	
	/**
	 * A utility method to calculate the total tax amount of each product added in shopping cart
	 * @param shoppingCartBasket List<Product>
	 * @return Formatted totalProductTaxPrice BigDecimal
	 */
	public static BigDecimal getTotalProductTaxPrice(List<Product> shoppingCartBasket) {

		double result = 0;
		for (Product products : shoppingCartBasket) {
			result += products.getTaxAmount(products.getUnitPrice(), products.getTaxRate());
		}
		return FormatUtils.performDecimalFormat(result);
	}
}
