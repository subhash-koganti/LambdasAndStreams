package com.ug.codecafe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UGCodeCafeDemo {
	
	public static void main(String[] args) {
		
		Set<RateQuote> rateQuoteSet = new HashSet<RateQuote>();
		
		long startTime = System.currentTimeMillis();
		List<RateQuote> rateQuoteList = RateQuoteDataGenerator.createDummyRateQuotes(2000);
		
		long endTime = System.currentTimeMillis();
		
		
		long startTimeForLambdaIteration = System.currentTimeMillis();
		rateQuoteSet = rateQuoteList.stream().parallel()
			.filter(rq -> rq.getBorrowerName().equals("HeMan"))
			.peek((rq)-> System.out.println(rq))
			.collect(Collectors.toSet());
		
		long endTimeForLambdaIteration = System.currentTimeMillis();
		
		
		
		
		
		long startTimeForRegularIteration = System.currentTimeMillis();
		rateQuoteSet = new HashSet<RateQuote>();
		
		for(int i=0; i<rateQuoteList.size();i++){
			if(rateQuoteList.get(i).getBorrowerName().equals("HeMan")){
				rateQuoteSet.add(rateQuoteList.get(i));
				System.out.println(rateQuoteList.get(i));
			}
		}
		long endTimeForRegularIteration = System.currentTimeMillis();
		
		
		
		System.out.println("Total Time taken for data Creation is " + ( endTime - startTime) + " milli secs");
		System.out.println("Total Time taken for Lambda Iteration is " + ( endTimeForLambdaIteration - startTimeForLambdaIteration) + " milli secs");
		System.out.println("Total Time taken for Regular Iteration is " + ( endTimeForRegularIteration - startTimeForRegularIteration) + " milli secs");
		
	}

}
