package com.ug.codecafe;

import java.util.List;

public class RateQuote {

	private long quoteID;
	private long baseLoanAmount;
	private String borrowerName;
	private int borrowerAge;
	private long borrowerMonthlyIncome;
	private String lenderHomeOfficeID;
	private List<Product> productList;

	public RateQuote(long quoteID, long baseLoanAmount, String borrowerName, int borrowerAge, long borrowerMonthlyIncome,
			String lenderHomeOfficeID, List<Product> productList) {
		super();
		this.quoteID = quoteID;
		this.baseLoanAmount = baseLoanAmount;
		this.borrowerName = borrowerName;
		this.borrowerAge = borrowerAge;
		this.borrowerMonthlyIncome = borrowerMonthlyIncome;
		this.lenderHomeOfficeID = lenderHomeOfficeID;
		this.productList = productList;
	}



	


	@Override
	public String toString() {
		return "RateQuote [quoteID=" + quoteID + ", baseLoanAmount=" + baseLoanAmount + ", borrowerName=" + borrowerName
				+ ", borrowerAge=" + borrowerAge + ", borrowerMonthlyIncome=" + borrowerMonthlyIncome
				+ ", lenderHomeOfficeID=" + lenderHomeOfficeID + ", productList=" + productList + ", toString()="
				+ super.toString() + "]";
	}






	public long getQuoteID() {
		return quoteID;
	}



	public void setQuoteID(long quoteID) {
		this.quoteID = quoteID;
	}



	public long getBaseLoanAmount() {
		return baseLoanAmount;
	}

	public void setBaseLoanAmount(long baseLoanAmount) {
		this.baseLoanAmount = baseLoanAmount;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public long getBorrowerMonthlyIncome() {
		return borrowerMonthlyIncome;
	}

	public void setBorrowerMonthlyIncome(long borrowerMonthlyIncome) {
		this.borrowerMonthlyIncome = borrowerMonthlyIncome;
	}

	public String getLenderHomeOfficeID() {
		return lenderHomeOfficeID;
	}

	public void setLenderHomeOfficeID(String lenderHomeOfficeID) {
		this.lenderHomeOfficeID = lenderHomeOfficeID;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getBorrowerAge() {
		return borrowerAge;
	}

	public void setBorrowerAge(int borrowerAge) {
		this.borrowerAge = borrowerAge;
	}

}
