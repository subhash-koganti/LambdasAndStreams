package com.ug.codecafe;

public class RateQuoteLenderAndAgeTester implements RateQuoteTester {

	@Override
	public boolean test(RateQuote rq) {
		
		boolean result =false;
		if(rq.getBorrowerAge()<50 &&   rq.getLenderHomeOfficeID().equals("329999120") ){
			result =true;
		}
		
		return result;
	}
	

}
