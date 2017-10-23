package cn.homjie.spring.webflow.domain;


public class CreditCardPayment extends Payment {
	private String authorization;

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String toString() {
		return "CREDIT:  $" + getAmount() + " ; AUTH: " + authorization;
	}
}
