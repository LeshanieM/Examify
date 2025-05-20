//IT23154230 - H.H.W.Palliyaguruge.
package model;


public class Examiner {
	
	private String ExaminerID;
	private String ExaminerName;
	private long contactNo;
	private String address;
	private String qualification;
	private String email;
	
	
	// getters and setters .
	public String getExaminerID() {
		return ExaminerID;
	}
	public void setExaminerID(String examinerID) {
		ExaminerID = examinerID;
	}
	public String getExaminerName() {
		return ExaminerName;
	}
	public void setExaminerName(String examinerName) {
		ExaminerName = examinerName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//to print the examiner details.
	public String toString() {
		return "Examiner ID = " + ExaminerID + "\n" + "Examiner Name = " + ExaminerName + "\n" + "Contact Number =" + contactNo + "\n" + "Address =" + address + "\n" + "Qualification = " + qualification + "\n" + "Email =" + email ;
		
	}
	
	
	
	
	

}
