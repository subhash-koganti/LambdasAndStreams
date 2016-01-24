package com.ug.codecafe;

import java.util.List;

public class RateQuote {

	private long baseLoanAmount;
	private String borrowerName;
	private long borrowerMonthlyIncome;
	private String lenderHomeOfficeID;
	private List<Product> productList;

	public RateQuote(long baseLoanAmount, String borrowerName, long borrowerMonthlyIncome, String lenderHomeOfficeID,
			List<Product> productList) {
		super();
		this.baseLoanAmount = baseLoanAmount;
		this.borrowerName = borrowerName;
		this.borrowerMonthlyIncome = borrowerMonthlyIncome;
		this.lenderHomeOfficeID = lenderHomeOfficeID;
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "RateQuote [baseLoanAmount=" + baseLoanAmount + ", borrowerName=" + borrowerName
				+ ", borrowerMonthlyIncome=" + borrowerMonthlyIncome + ", lenderHomeOfficeID=" + lenderHomeOfficeID
				+ ", productList=" + productList + "]";
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

}
