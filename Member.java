package classes;

public class Member {
	private String memberCode;
	private String name;
	private String address;
	private char type;
	private Person primaryContact;

	public Member(String memberCode, String name, String address, char type, Person primaryContact) {
		super();
		this.memberCode = memberCode;
		this.name = name;
		this.address = address;
		this.type = type;
		this.primaryContact = primaryContact;
		
	}

	public String getMemberCode() {
		return memberCode;
	}



	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
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



	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public Person getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(Person primaryContact) {
		this.primaryContact = primaryContact;
	}
	
	
	
}
