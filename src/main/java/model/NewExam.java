//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package model;

//create a new exam
public class NewExam {

	
	//variables
	private String eID;
	private String courseName;
	private String examType;
	private String date;
	private String courseID;
	
	
	
	//getters and setters
	public String geteID() {
		return eID;
	}
	
	public void seteID(String eID) {
		this.eID = eID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getExamType() {
		return examType;
	}
	
	public void setExamType(String examType) {
		this.examType = examType;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	
	
}
