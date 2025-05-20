package model;


public class Payment {
	
	private int PID;
	private String name;
	private String number;
	private String expiry_date;
	private String cvv;
	
	
	public Payment(int pID, String name, String number, String expiry_date, String cvv) {
		super();
		PID = pID;
		this.name = name;
		this.number = number;
		this.expiry_date = expiry_date;
		this.cvv = cvv;
	}
	
	
	
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
}
	
	