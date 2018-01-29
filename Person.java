package classes;

public class Person {
	private String personCode;
	private String name;
	private String address;
	private String emailAddress;
	
	
	public Person(String personCode, String name, String address, String emailAddress) {
		super();
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}
	
	public Person(String personCode, String name, String address) {
		super();
		this.personCode = personCode;
		this.name = name;
		this.address = address;
	}

	public Person() {
		super();
		personCode = null;
		name = null;
		address = null;
		emailAddress = null;
	}

	public String getPersonCode() {
		return personCode;
	}


	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
