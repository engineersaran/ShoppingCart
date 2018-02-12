package com.ee.products;

/**
 * Class describing Dove soap product
 */
public class Dove extends Product {

	private String productName;
	private double unitPrice;
	private double taxRate;

	public Dove(String productName, double unitPrice, double taxRate) {
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
