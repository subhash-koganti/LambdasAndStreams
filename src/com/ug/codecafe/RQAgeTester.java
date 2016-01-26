package com.ug.codecafe;

public class RQAgeTester implements RateQuoteCriteriaTest {

	@Override
	public boolean test(RateQuote rq) {
		
		boolean result = false;
		if( rq.getBorrowerAge() > 50){
			result =true;
		}
		
		return result;
	}

}
