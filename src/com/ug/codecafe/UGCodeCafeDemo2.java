package com.ug.codecafe;

import java.util.Date;
import java.util.stream.Stream;
/**
 * 
 * @author koganti
 *
 */
public class UGCodeCafeDemo2 {

	public static void main(String[] args) {

		Stream<Date> stream = Stream.generate(() -> { return new Date();});
        stream.forEach(p -> System.out.println(p));
		
//		long startTime = System.currentTimeMillis();
//		List<RateQuote> rateQuoteList1 = RateQuoteDataGenerator.createDummyRateQuotes(2000);
//		long endTime = System.currentTimeMillis();
//
//		long startTimeRegularLoop = System.currentTimeMillis();
//		List<RateQuote> rateQuoteList2 = RateQuoteDataGenerator.createDummyRateQuoteDataUsingRegularLoops(2000);
//		long endTimeRegularLoop = System.currentTimeMillis();
//		
//		System.out.println("Time Taken for Lambdas is " + (endTime-startTime));
//		System.out.println("Time Taken for Regular is " + (endTimeRegularLoop - startTimeRegularLoop));
	}

}
