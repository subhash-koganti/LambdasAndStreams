package com.ug.codecafe;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<RateQuote> rateQuoteList = new ArrayList<RateQuote>();

		rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingIntStream(20);

		for (int i = 0; i < rateQuoteList.size(); i++) {

			printaAllRateQuote(rateQuoteList.get(i));
		}

		
		System.out.println("****\n\n");
		for (int i = 0; i < rateQuoteList.size(); i++) {

			printRateQuoteWithInterfaceImpl(rateQuoteList.get(i), (RateQuote rq -> rq.getBorrowerAge()>50 )
			
		}

	}
	
	
	private static void printRateQuoteWithInterfaceImpl(RateQuote rq , RateQuoteCriteriaTest tester) {

		if (tester.test(rq))
			System.out.println(rq);
	}

	

	private static void printaAllRateQuote(RateQuote rateQuote) {

			System.out.println(rateQuote);
	}

	private static void printRateQuote(RateQuote rateQuote) {

		if (rateQuote.getBorrowerAge() > 50)
			System.out.println(rateQuote);
	}

}
