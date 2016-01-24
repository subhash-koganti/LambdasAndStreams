package com.ug.codecafe;

import java.util.List;

public class UGCodeCafeDemo3 {

	public static void main(String[] args) {

		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingStreamGenerate(10);
		
		
		
		for (int i = 0; i < rateQuoteList.size(); i++) {
			if (testRateQuoteCriteria(rateQuoteList.get(i))) {
				
				System.out.println(rateQuoteList.get(i));
				
			}
		}

	}
	
	private static boolean testRateQuoteCriteria ( RateQuote rq){
		boolean result = false;
		
		if((rq.getBorrowerAge() > 40)
					&& rq.getLenderHomeOfficeID().equals("329999120")){
			result =true;
		}
		return result;
	}

}
