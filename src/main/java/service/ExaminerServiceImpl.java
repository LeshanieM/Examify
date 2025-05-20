//IT23154230 - H.H.W.Palliyaguruge.
package service;

import java.util.logging.Level;



import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Examiner;

//import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

import util.CommonConstants;
import util.CommonUtil;
import util.DBConnection;
import util.QueryUtil;

public class ExaminerServiceImpl  implements IExaminerService{
	
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ExaminerServiceImpl.class.getName());



	private static Connection connection;

	//private static Statement statement;

	/*static{
		//create table or drop if exist
		createExaminerTable();
	}*/

	private PreparedStatement preparedStatement;

	/**
	 * This method initially drop existing Examiner table in the database and
	 * recreate table structure to insert Examiner entries
	 */
	/*public static void createExaminerTable() {

		try {
			connection = (Connection) DBConnectionUtil.getDBConnection();
			statement = (Statement) connection.createStatement();
			// Drop table if already exists and as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_DROP_TABLE));
			// Create new Examiner table as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_TABLE));
			
		} catch (Exception e) {
			log.log(Level.SEVERE, ( e.getMessage()));
		}
	}*/

	

	/**
	 * Add set of Examiner for as a batch from the selected Examiner List
	 
	 */
	@Override
	public void addExaminer(Examiner examiner) {

		String examinerID = CommonUtil.generateIDs(getExaminerIDs());
		
		try {
			connection = (Connection) DBConnection.getConnection();
			/*
			 * Query is available in ExaminerQuery.xml file and use
			 * insert_Examiner key to extract value of it
			 */
			preparedStatement = (PreparedStatement) connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_EXAMINER));
			connection.setAutoCommit(false);
			
			//Generate Examiner IDs
			examiner.setExaminerID(examinerID);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, examiner.getExaminerID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, examiner.getExaminerName());
			preparedStatement.setLong(CommonConstants.COLUMN_INDEX_THREE, examiner.getContactNo());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, examiner.getAddress());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, examiner.getQualification());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SIX,examiner.getEmail());
			
			// Add Examiner
			preparedStatement.execute();
			connection.commit();

		} catch (SQLException |ClassNotFoundException|IOException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getMessage());
		} 
		catch( ParserConfigurationException e){
			e.printStackTrace();
			
		}catch(SAXException e){
			e.printStackTrace();
		}finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
	}

	/**
	 * Examiner details can be retrieved based on the provided examiner ID
	
	 */
	//@Override
	//public Examiner getExaminerByID(String examinerID) {

		//return actionOnExaminer(examinerID).get(0);
	//}
	public Examiner getExaminerByID(String examinerID) {
	    List<Examiner> examiners = actionOnExaminer(examinerID); // Assuming actionOnExaminer returns a List
	    
	    // Check if the list is null or empty
	    if (examiners == null || examiners.isEmpty()) {
	        // Handle the case where no examiner is found (either return null, throw an exception, or handle accordingly)
	        throw new RuntimeException("No examiner found for ID: " + examinerID);
	    }
	    
	    // Return the first examiner if the list is not empty
	    return examiners.get(0);
	}
	
	/**
	 * Get all list of examiners
	
	 */
	@Override
	public ArrayList<Examiner> getExaminers() {
		
		return actionOnExaminer(null);
	}


	// delete an Examiner based on the provided ID
	@Override
	public void removeExaminer(String examinerID) {

		// Before deleting check whether examiner ID is available
		if (examinerID != null && !examinerID.isEmpty()) {
			/*
			 * Remove examiner query will be retrieved from ExaminerQuery.xml
			 */
			try {
				connection = (Connection)DBConnection.getConnection();
				preparedStatement = (PreparedStatement) connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_EXAMINER));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, examinerID);
				preparedStatement.executeUpdate();
			} catch ( Exception  e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}
	}

	/**
	 * This performs GET examiner by ID and Display all examiners.
	
	 */
	private ArrayList<Examiner> actionOnExaminer(String examinerID) {

		ArrayList<Examiner> examinerList = new ArrayList<Examiner>();
		try {
			connection = (Connection) DBConnection.getConnection();
			/*
			 * Before fetching examiner it checks whether examiner ID is
			 * available
			 */
			if (examinerID != null && !examinerID.isEmpty()) {
				/*
				 * Get examiner by ID query will be retrieved from
				 * ExaminerQuery.xml
				 */
				preparedStatement = (PreparedStatement) connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_EXAMINER));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, examinerID);
			}
			/*
			 * If examiner ID is not provided for get examiner option it display
			 * all examiners
			 */
			else {
				preparedStatement = (PreparedStatement) connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_ALL_EXAMINERS));
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Examiner examiner = new Examiner();
				examiner.setExaminerID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				examiner.setExaminerName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				examiner.setContactNo(resultSet.getInt(CommonConstants.COLUMN_INDEX_THREE));
				examiner.setAddress(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				examiner.setQualification(resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE));
				examiner.setEmail(resultSet.getString(CommonConstants.COLUMN_INDEX_SIX));
				examinerList.add(examiner);
			}

		} catch ( Exception  e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return examinerList;
	}

	/**
	 * Get the updated examiner
	 * @return 
	
	 */
	@Override
	public Examiner updateExaminer(String examinerID, Examiner examiner) {

	    // Check if the examinerID is valid
	    if (examinerID != null && !examinerID.isEmpty()) {
	        try {
	            // Establish a database connection
	            connection = (Connection) DBConnection.getConnection();
	            
	            // Prepare the SQL update statement
	            preparedStatement = (PreparedStatement) connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_EXAMINER));
	            
	            // Set parameters for the prepared statement
	            preparedStatement.setString(1, examiner.getExaminerName()); // COLUMN_INDEX_ONE
	            preparedStatement.setLong(2, examiner.getContactNo()); // COLUMN_INDEX_TWO
	            preparedStatement.setString(3, examiner.getAddress()); // COLUMN_INDEX_THREE
	            preparedStatement.setString(4, examiner.getQualification()); // COLUMN_INDEX_FOUR
	            preparedStatement.setString(5, examiner.getEmail()); // COLUMN_INDEX_FIVE
	            
	            // The last parameter should be the examinerID for the WHERE clause
	            preparedStatement.setString(6, examinerID); // COLUMN_INDEX_SIX
	            
	            // Execute the update
	            preparedStatement.executeUpdate();
	            
	        } catch (Exception e) {
	            log.log(Level.SEVERE, e.getMessage());
	        } finally {
	            // Close the prepared statement and connection in the finally block
	            try {
	                if (preparedStatement != null) {
	                    preparedStatement.close();
	                }
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (Exception e) {
	                log.log(Level.SEVERE, e.getMessage());
	            }
	        }
	    } else {
	        log.log(Level.WARNING, "Examiner ID is invalid.");
	    }
	    return getExaminerByID(examinerID);
	}
	/*public Examiner updateExaminer(String examinerID, Examiner examiner) {

		/*
		 * Before fetching examiner it checks whether examiner ID is available
		 */
		//if (examinerID != null && !examinerID.isEmpty()) {
			/*
			 * Update examiner query will be retrieved from ExaminerQuery.xml
			 */
			/*try {
				connection = (Connection) DBConnectionUtil.getDBConnection();
				preparedStatement = (PreparedStatement) connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_EXAMINER));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, examiner.getExaminerName());
				preparedStatement.setLong(CommonConstants.COLUMN_INDEX_TWO, examiner.getContactNo());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, examiner.getAddress());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, examiner.getQualification());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, examiner.getEmail());
				
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_SIX, examiner.getExaminerID());
				preparedStatement.executeUpdate();*/

			//} catch ( Exception e) {
				//log.log(Level.SEVERE, e.getMessage());
			//} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				/*try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e ) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}*/
		// Get the updated examiner
		/*return getExaminerByID(examinerID);
	}*/
	
	/**
	 *
	 * @return ArrayList<String> Array of examiner id list will be return
	
	 */
	private ArrayList<String> getExaminerIDs(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of examiner IDs will be retrieved from ExaminerQuery.xml
		 */
		try {
			connection = (Connection) DBConnection.getConnection();
			preparedStatement = (PreparedStatement) connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_EXAMINER_IDS));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return arrayList;
	}

	

	
}


