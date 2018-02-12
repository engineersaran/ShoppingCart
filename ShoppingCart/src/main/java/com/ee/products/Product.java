package com.ee.products;

import com.ee.common.util.ProductTaxAmountUtil;

/**
 * An abstract class describing Product to be added in Shopping cart basket
 */
public abstract class Product {

	public abstract double getUnitPrice();

	public abstract String getProductName();

	public abstract double getTaxRate();
	

	/**
	 * Method to calculate the tax amount of a product added in shopping cart
	 * @param unitPrice
	 * @param taxRate
	 * @return taxAmount double
	 */
	public double getTaxAmount(double unitPrice, double taxRate) {
		
		return ProductTaxAmountUtil.getTaxAmount(unitPrice, taxRate);
	}
}
