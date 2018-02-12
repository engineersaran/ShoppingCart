package com.ee.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A utility class to perform Decimal formatting operation.
 */
public class FormatUtils {
	
	/**
	 * A utility method to perform 2 decimal places formatting.
	 * For example 0.567 should result in 0.57 but 0.564 should result in 0.56
	 * @param notFormattedvalue double
	 * @return formattedValue BigDecimal
	 */
	public static BigDecimal performDecimalFormat(double notFormattedvalue) {

		BigDecimal formattedValue = BigDecimal.valueOf(notFormattedvalue);
		formattedValue = formattedValue.setScale(2, RoundingMode.HALF_UP);
		return formattedValue;
	}
}
