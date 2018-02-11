
abstract class Employee {
	private String name;
	private char sex;
	private String arrival_Date;
	private String phoneNumber;
	private String address;
	
	Employee() {
		
	}
	
	Employee(String name, char sex, String arrival_Date, String phoneNumber, String address) {
		this.name = name;
		this.sex = sex;
		this.arrival_Date = arrival_Date;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getArrival_Date() {
		return arrival_Date;
	}

	public void setArrival_Date(String arrival_Date) {
		this.arrival_Date = arrival_Date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	void display() {
		System.out.println("Name: " + name);
		if(sex=='F') System.out.println("Sex: Female"); else System.out.println("Sex: Male"); 
		System.out.println("Arrival Date: " + arrival_Date);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
	}
	
	abstract double paySalary();
}
