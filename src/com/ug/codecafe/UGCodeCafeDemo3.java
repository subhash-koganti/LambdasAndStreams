package com.ug.codecafe;

import java.util.List;

public class UGCodeCafeDemo3 {

	public static void main(String[] args) {

		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingStreamGenerate(10);

		RateQuoteTester rateQuoteTester = new RateQuoteAgeTester();

		System.out.println(" The RateQuotes with Boorwer Age less than 50 are as follows \n\n ");
		for (int i = 0; i < rateQuoteList.size(); i++) {
			if (rateQuoteTester.test(rateQuoteList.get(i))) {
				System.out.println(rateQuoteList.get(i));
			}
		}

		System.out.println("***************************************************************");
		
		RateQuoteTester rateQuoteTester2 = new RateQuoteLenderAndAgeTester();
		System.out.println(" \nThe RateQuotes with more test criteria are as follows \n\n");
		
		for (int i = 0; i < rateQuoteList.size(); i++) {
			if (rateQuoteTester2.test(rateQuoteList.get(i))) {
				System.out.println(rateQuoteList.get(i));
			}
		}

	}

	private static boolean testRateQuoteFroAgeGreaterThan40(RateQuote rq) {
		boolean result = false;

		if ((rq.getBorrowerAge() > 40)) {
			result = true;
		}
		return result;
	}

}
