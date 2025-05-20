//IT23154230 - H.H.W.Palliyaguruge.
package service;

import java.util.ArrayList;

import java.util.logging.Logger;

import model.Examiner;

public interface  IExaminerService {
	
	public static final Logger log = Logger.getLogger(IExaminerService.class.getName());


	/**
	 * Add examiners for examiners table
	 */
	public void addExaminer(Examiner examiner);

	/**
	 * Get a particular Examiner

	 */
	public Examiner getExaminerByID(String examinerID);
	
	/**
	 * Get all list of examiners
	 */
	public ArrayList<Examiner> getExaminers();
	
	/* Update existing examiner*/
	public Examiner updateExaminer(String examinerID, Examiner examiner);

	/* Remove existing examiner
	 */
	public void removeExaminer(String examinerID);

}



