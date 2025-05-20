// IT23149380 - P.G.T.N.D.Gallage 

package model;

public class Results {
	
	private int RID;
	private String studentID;
	private String examID;
	private int marks;
	private String grade;
	
	public Results(int RID, String studentID, String examID, int marks, String grade) {
		
		this.RID = RID;
		this.studentID = studentID;
		this.examID = examID;
		this.marks = marks;
		this.grade = grade;
	}

	public int getRID() {
		return RID;
	}

	public String getStudentID() {
		return studentID;
	}
	
	public String getExamID() {
		return examID;
	}

	public int getMarks() {
		return marks;
	}

	public String getGrade() {
		return grade;
	}

}
