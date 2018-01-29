package classes;

public class DayMembership extends Product {
	private String dateTime;
	private String address;
	private double cost;
	
	public DayMembership(String productCode, char productType, String dateTime, String address, double cost) {
		super(productCode, productType);
		this.dateTime = dateTime;
		this.address = address;
		this.cost = cost;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
