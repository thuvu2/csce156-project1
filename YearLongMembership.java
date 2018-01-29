package classes;

import classes.Product;

public class YearLongMembership extends Product {
	private String startDate;
	private String endDate;
	private String address;
	private String membershipName;
	private double pricePerUnit;
	
	public YearLongMembership(String productCode, char productType, String startDate, String endDate, String address,
			String membershipName, double pricePerUnit) {
		super(productCode, productType);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.membershipName = membershipName;
		this.pricePerUnit = pricePerUnit;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMembershipName() {
		return membershipName;
	}

	public void setMembershipName(String membershipName) {
		this.membershipName = membershipName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	
}
