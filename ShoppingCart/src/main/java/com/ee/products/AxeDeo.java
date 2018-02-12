package com.ee.products;

/**
 * Class describing Axe Deo product
 */
public class AxeDeo extends Product {

	private final String productName;
	private double unitPrice;
	private double taxRate;

	public AxeDeo(String productName, double unitPrice, double taxRate) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.taxRate = taxRate;
	}

	@Override
	public double getUnitPrice() {
		return unitPrice;
	}

	@Override
	public String getProductName() {
		return productName;
	}

	@Override
	public double getTaxRate() {
		return taxRate;
	}
}
