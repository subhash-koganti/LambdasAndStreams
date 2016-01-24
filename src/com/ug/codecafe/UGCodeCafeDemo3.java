package com.ug.codecafe;

import java.util.List;

public class UGCodeCafeDemo3 {
	
	public static void main(String[] args) {
		
		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingStreamGenerate(20);
		rateQuoteList.forEach((rq)->System.out.println(rq));
		
		
		
	}

}
