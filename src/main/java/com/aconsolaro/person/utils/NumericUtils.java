package com.aconsolaro.person.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class NumericUtils {

	public static Double convertToDouble(String strNumber) {
		if (isNumeric(strNumber)) {
			String number = strNumber.replace(",", ".");
			return NumberUtils.createDouble(number);
		}
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (StringUtils.isNotEmpty(strNumber)) {
			String number = strNumber.replace(",", ".");
			return NumberUtils.isCreatable(number);
		}
		return false;
	}
}
