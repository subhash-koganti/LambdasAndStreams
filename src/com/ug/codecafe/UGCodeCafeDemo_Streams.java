package com.ug.codecafe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * 
 * @author koganti
 *
 */
public class UGCodeCafeDemo_Streams {
	
	public static void main(String[] args) {
		
		Set<RateQuote> rateQuoteSet = new HashSet<RateQuote>();
		
		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotesUsingStreamGenerate(10000);
		
		
		long startTimeForLambdaIteration = System.currentTimeMillis();
		rateQuoteSet = rateQuoteList.stream()
			.filter(rq -> rq.getBorrowerName().equals("HeMan"))
//			.peek((rq)-> System.out.println(rq))
			.collect(Collectors.toSet());
		
		long endTimeForLambdaIteration = System.currentTimeMillis
				();
		
		
		
		long startTimeForRegularIteration = System.currentTimeMillis();
		rateQuoteSet = new HashSet<RateQuote>();
		
		for(int i=0; i<rateQuoteList.size();i++){
			if(rateQuoteList.get(i).getBorrowerName().equals("HeMan")){
				rateQuoteSet.add(rateQuoteList.get(i));
//				System.out.println(rateQuoteList.get(i));
			}
		}
		long endTimeForRegularIteration = System.currentTimeMillis();
		
		
		
		System.out.println("Total Time taken for Lambda Iteration is " + ( endTimeForLambdaIteration - startTimeForLambdaIteration) + " milli secs");
		System.out.println("Total Time taken for Regular Iteration is " + ( endTimeForRegularIteration - startTimeForRegularIteration) + " milli secs");
		
	}

}
