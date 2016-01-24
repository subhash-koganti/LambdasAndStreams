package com.ug.codecafe;

public class Product {
	
	private String premiumSourceCode;
	private String paymentOptionCode;
	private String paymentFrequencyCode;
	private String refundTypeCode;
	
	@Override
	public String toString() {
		return "Product [premiumSourceCode=" + premiumSourceCode + ", paymentOptionCode=" + paymentOptionCode
				+ ", paymentFrequencyCode=" + paymentFrequencyCode + ", renewalOptionCode=" + refundTypeCode + "]";
	}	
	
	public Product(String premiumSourceCode, String paymentOptionCode, String paymentFrequencyCode,
			String refundTypeCode) {
		super();
		this.premiumSourceCode = premiumSourceCode;
		this.paymentOptionCode = paymentOptionCode;
		this.paymentFrequencyCode = paymentFrequencyCode;
		this.refundTypeCode = refundTypeCode;
	}
	
	
	
	public String getPremiumSourceCode() {
		return premiumSourceCode;
	}

	public void setPremiumSourceCode(String premiumSourceCode) {
		this.premiumSourceCode = premiumSourceCode;
	}

	public String getPaymentOptionCode() {
		return paymentOptionCode;
	}

	public void setPaymentOptionCode(String paymentOptionCode) {
		this.paymentOptionCode = paymentOptionCode;
	}

	public String getPaymentFrequencyCode() {
		return paymentFrequencyCode;
	}

	public void setPaymentFrequencyCode(String paymentFrequencyCode) {
		this.paymentFrequencyCode = paymentFrequencyCode;
	}

	public String getRenewalOptionCode() {
		return refundTypeCode;
	}

	public void setRenewalOptionCode(String refundTypeCode) {
		this.refundTypeCode = refundTypeCode;
	}



}
