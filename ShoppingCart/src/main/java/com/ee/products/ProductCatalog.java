package com.ee.products;

import static com.ee.common.constants.ProductConstants.AXE_NAME;
import static com.ee.common.constants.ProductConstants.AXE_TAX_RATE;
import static com.ee.common.constants.ProductConstants.AXE_UNIT_PRICE;
import static com.ee.common.constants.ProductConstants.DOVE_NAME;
import static com.ee.common.constants.ProductConstants.DOVE_TAX_RATE;
import static com.ee.common.constants.ProductConstants.DOVE_UNIT_PRICE;

/**
 * Product Catalog Factory class which is responsible for creation of products
 *
 */
public class ProductCatalog {

	/**
	 * 
	 * A factory method to create the product based on its name from customer. 
	 * @param productName
	 * @return product Product
	 */
	public static Product getProduct(String productName) {

		Product product;

		switch (productName) {
		case DOVE_NAME:
			product = new Dove(productName, DOVE_UNIT_PRICE, DOVE_TAX_RATE);
			break;

		case AXE_NAME:
			product = new AxeDeo(productName, AXE_UNIT_PRICE, AXE_TAX_RATE);
			break;

		default:
			product = null;
			break;
		}

		return product;
	}

}
