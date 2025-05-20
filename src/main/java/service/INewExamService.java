//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package service;

import java.util.ArrayList;

import java.util.logging.Logger;

import model.NewExam;

//interface for new exam service implementation
public interface INewExamService {
	
	public static final Logger log1 = Logger.getLogger(INewExamService.class.getName());
	
	public void addNewExam(NewExam newExam);
	
	public ArrayList<NewExam> getNewExam();
	
	public ArrayList<NewExam> getNewExamById(String eID);
	
	public void updateNewExam(String eID, NewExam newExam);
	
	public void DeleteNewExam(String eID);

}
