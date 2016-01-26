package com.ug.codecafe;

import java.util.List;
/**
 * 
 * @author koganti
 *
 */
public class UGCodeCafeDemo3 {

	public static void main(String[] args) {

		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingStreamGenerate(10);


		System.out.println(" The RateQuotes with test Criteria is as follows \n\n ");
		for (int i = 0; i < rateQuoteList.size(); i++) {
			if ((new RateQuoteTester() {
				
				@Override
				public boolean test(RateQuote rq) {
					boolean result =false;
					if(rq.getBorrowerAge()<50 &&   rq.getLenderHomeOfficeID().equals("329999120") ){
						result =true;
					}
					return result;
				}
			}).test(rateQuoteList.get(i))) {
				System.out.println(rateQuoteList.get(i));
			}
		}

		

	}

	

}
