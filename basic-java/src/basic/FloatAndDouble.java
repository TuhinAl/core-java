package basic;

import java.math.BigDecimal;

public class FloatAndDouble {

	public static void main(String[] args) {
		//gaahaap_38Tw5WRjmyDCKcADEWs39kG2C1t3Ot2Q5Hxn

		float floatValue = 0.1f;
		double doubleValue = 0.2;
		
		System.out.println(0.1 + 0.2);
		System.out.println(1- 0.9);
		BigDecimal valueOne = new BigDecimal("1");
		BigDecimal valueTwo = new BigDecimal("0.9");
		
		System.out.println(valueOne.add(valueTwo));
		System.out.println(floatValue+doubleValue);
		// today task==> list of bigDecimal value add, subs

	}

}
