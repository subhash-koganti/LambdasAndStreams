package com.ug.codecafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class RateQuoteDataGenerator {
	
	private static String[] paymentOptionCodes = {"R", "Y" ,"P","X","FHA" };
	
	private static String[] paymentFrequencyCodes = {"M", "S" ,"A"};
	
	private static String[] refundTypeCodes = {"R", "N" };
	
	private static  String[] premiumSourceCodes = {"A", "B" };
	
	private static long[] baseLoanAmounts = { 160000 , 200000,180000,300000,250000};
	
	private static long[] borrowerMonthlyIncomes = { 5000 , 6000,7000,8000,9000};
	
	private static String[] borrowerNames = {"Batman" ,  "HeMan" , "SpiderMan" , "SuperMan" , "AntMan" }; 
	
	private static String[] lenderIDs = {"329999120" ,"329999111" , "329999122" ,"329999223" };
	
	public static List<RateQuote> createDummyRateQuotesUsingIntStream(int count){
		
		List<RateQuote> rateQuoteList = new ArrayList<RateQuote>();
		
		rateQuoteList = IntStream.range(1,count)
			.mapToObj((p) -> {
				
				List<Product> productList = createProductList();
				long baseLoanAmount =baseLoanAmounts[new Random().nextInt(baseLoanAmounts.length)];
				long borrowerIncome =borrowerMonthlyIncomes[new Random().nextInt(borrowerMonthlyIncomes.length)];
				String borrowerName =borrowerNames[new Random().nextInt(borrowerNames.length)];
				String lenderID = lenderIDs[new Random().nextInt(lenderIDs.length)];
				
				return new RateQuote(baseLoanAmount,borrowerName,borrowerIncome,lenderID,productList);
				
			}).collect(Collectors.toList());
		
			
		
		return rateQuoteList;
	}
	
	public static List<RateQuote> createDummyRateQuotesUsingStreamGenerate(int count){
		List<RateQuote> rateQuoteList = new ArrayList<RateQuote>();
		
		rateQuoteList = Stream.generate( () -> { 
			List<Product> productList = createProductListUsingStreamGenerate();
			long baseLoanAmount =baseLoanAmounts[new Random().nextInt(baseLoanAmounts.length)];
			long borrowerIncome =borrowerMonthlyIncomes[new Random().nextInt(borrowerMonthlyIncomes.length)];
			String borrowerName =borrowerNames[new Random().nextInt(borrowerNames.length)];
			String lenderID = lenderIDs[new Random().nextInt(lenderIDs.length)];
			
			return new RateQuote(baseLoanAmount,borrowerName,borrowerIncome,lenderID,productList);
		
		}).limit(count).collect(Collectors.toList());
		
		return rateQuoteList;
	}
	
	

	private static List<Product> createProductListUsingStreamGenerate() {
		List<Product> productList = new ArrayList<Product>();
		productList = Stream.generate( () -> { 
			String paymentOptionCode  = paymentOptionCodes[new Random().nextInt(paymentOptionCodes.length)];
			String paymentFrequencyCode = paymentFrequencyCodes[new Random().nextInt(paymentFrequencyCodes.length)];
			String refundTypeCode = refundTypeCodes[new Random().nextInt(refundTypeCodes.length)];
			String premiumSourceCode = premiumSourceCodes[new Random().nextInt(premiumSourceCodes.length)];
			
			Product product = new Product(premiumSourceCode,paymentOptionCode,paymentFrequencyCode,refundTypeCode);
			return product;
		
		}).limit(4).collect(Collectors.toList());
		return productList;
	}

	private static List<Product> createProductList() {
		return IntStream.rangeClosed(1,4)
			.mapToObj((q)-> {

				String paymentOptionCode  = paymentOptionCodes[new Random().nextInt(paymentOptionCodes.length)];
				String paymentFrequencyCode = paymentFrequencyCodes[new Random().nextInt(paymentFrequencyCodes.length)];
				String refundTypeCode = refundTypeCodes[new Random().nextInt(refundTypeCodes.length)];
				String premiumSourceCode = premiumSourceCodes[new Random().nextInt(premiumSourceCodes.length)];
				
				Product product = new Product(premiumSourceCode,paymentOptionCode,paymentFrequencyCode,refundTypeCode);
				return product;
			}).collect(Collectors.toList());
	}
	
	
	public static List<RateQuote> createDummyRateQuoteDataUsingRegularLoops(int count){
		List<RateQuote> rateQuoteList = new ArrayList<RateQuote>();
		
		for(int i=0; i< count ;i++){
			List<Product> productList = new ArrayList<Product>();
			for(int j=0;j<4;j++){
				String paymentOptionCode  = paymentOptionCodes[new Random().nextInt(paymentOptionCodes.length)];
				String paymentFrequencyCode = paymentFrequencyCodes[new Random().nextInt(paymentFrequencyCodes.length)];
				String refundTypeCode = refundTypeCodes[new Random().nextInt(refundTypeCodes.length)];
				String premiumSourceCode = premiumSourceCodes[new Random().nextInt(premiumSourceCodes.length)];
				
				productList.add(new Product(premiumSourceCode,paymentOptionCode,paymentFrequencyCode,refundTypeCode));
			}
			
			
			long baseLoanAmount =baseLoanAmounts[new Random().nextInt(baseLoanAmounts.length)];
			long borrowerIncome =borrowerMonthlyIncomes[new Random().nextInt(borrowerMonthlyIncomes.length)];
			String borrowerName =borrowerNames[new Random().nextInt(borrowerNames.length)];
			String lenderID = lenderIDs[new Random().nextInt(lenderIDs.length)];
			
			rateQuoteList.add(new RateQuote(baseLoanAmount,borrowerName,borrowerIncome,lenderID,productList));
		}
		
		return rateQuoteList;
	}

}
