//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package service;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.sql.Statement;

import java.util.logging.Level;

import model.NewExam;
import util.CommonConstants;
import util.CommonUtil;
import util.DBConnection;
import util.QueryUtil;

public class NewExamServiceImpl implements INewExamService{
	
	public static final Logger log1 = Logger.getLogger(NewExamServiceImpl.class.getName());
	
	private static Connection connection;
	private static Statement stmt;
	private static PreparedStatement preparedStatement;
	
	static {
		
		
		createNewExamTable();
	}

	
	//create new exam table in DB without manuallly creating
	public static void createNewExamTable() {
		
		try {
		
			connection = DBConnection.getConnection();
			
			stmt = connection.createStatement();	
			
			stmt.execute(QueryUtil.queryById(CommonConstants.QUERY_ID_CREATE_NEWEXAM_TABLE));
			
		}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			
			System.out.println("create table ecxeption " + e.getMessage());			
		}finally {
			
			try {
				
				if(connection != null) {
					
					connection.close();
				}
				
				if(stmt != null) {
					
					stmt.close();
				}
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
				log1.log(Level.SEVERE, e.getMessage());
				
			}
		}
		
	}
	
	
	//insert new exam method
	@Override
	public void addNewExam(NewExam newExam) {
		
		String eID = CommonUtil.generateNewExamIds(getNewExamIds());
		
		try {
			
			connection = DBConnection.getConnection();
			
			preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_INSERT_NEWEXAM));
			connection.setAutoCommit(false);//the application must explicitly commit or roll back the transaction.
			
			newExam.seteID(eID);
			
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, newExam.geteID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, newExam.getCourseName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, newExam.getExamType());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, newExam.getDate());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, newExam.getCourseID());
			
			//return the total number of rows affected as a long value
			preparedStatement.executeLargeUpdate();
			connection.commit();//commit the current transaction. 
			
		}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}finally {
			
			try {
				
				if(connection != null) {
					
					connection.close();
				}
				
				if(preparedStatement != null) {
					
					preparedStatement.close();
				}
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
				log1.log(Level.SEVERE, e.getMessage());
				
			}
		}
		
	}

	
	//getNewExam method
	@Override
	public ArrayList<NewExam> getNewExam() {
		
		ArrayList <NewExam> newExamList = new ArrayList<NewExam>();
		
		try {
			
			connection = DBConnection.getConnection();
			
			preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_GET_ALL_NEWEXAM));
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				NewExam newExam = new NewExam();
				
				newExam.seteID(rs.getString(CommonConstants.COLUMN_INDEX_ONE));
				newExam.setCourseName(rs.getString(CommonConstants.COLUMN_INDEX_TWO));
				newExam.setExamType(rs.getString(CommonConstants.COLUMN_INDEX_THREE));
				newExam.setDate(rs.getString(CommonConstants.COLUMN_INDEX_FOUR));
				newExam.setCourseID(rs.getString(CommonConstants.COLUMN_INDEX_FIVE));
				
				newExamList.add(newExam);
			}
			
		}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}finally {
			
			try {
				
				if(connection != null) {
					
					connection.close();
				}
				
				if(preparedStatement != null) {
					
					preparedStatement.close();
				}
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
				log1.log(Level.SEVERE, e.getMessage());
				
			}
		}
		
		return newExamList;
	}

	//update method
	@Override
	public ArrayList<NewExam> getNewExamById(String eID) {
		
		ArrayList <NewExam> newExamList = new ArrayList <NewExam>();
		
		try {
			
			connection = DBConnection.getConnection();
			
			preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_GET_NEWEXAM_BY_ID));
			
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, eID);
			
			ResultSet rs = preparedStatement.executeQuery();
			

			while(rs.next()) {
				
				NewExam newExam = new NewExam();
				
				newExam.seteID(rs.getString(CommonConstants.COLUMN_INDEX_ONE));
				newExam.setCourseName(rs.getString(CommonConstants.COLUMN_INDEX_TWO));
				newExam.setExamType(rs.getString(CommonConstants.COLUMN_INDEX_THREE));
				newExam.setDate(rs.getString(CommonConstants.COLUMN_INDEX_FOUR));
				newExam.setCourseID(rs.getString(CommonConstants.COLUMN_INDEX_FIVE));
				
				newExamList.add(newExam);
			}
			
		}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}finally {
			
			try {
				
				if(connection != null) {
					
					connection.close();
				}
				
				if(preparedStatement != null) {
					
					preparedStatement.close();
				}
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
				log1.log(Level.SEVERE, e.getMessage());
				
			}
		}
		
		return newExamList;


			
			
	}

	@Override
	public void updateNewExam(String eID, NewExam newExam) {
	try {
				
				connection = DBConnection.getConnection();
				
				preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_UPDATE_NEWEXAM));
				connection.setAutoCommit(false);//the application must explicitly commit or roll back the transaction.
		
				
				
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, newExam.getCourseName());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, newExam.getExamType());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, newExam.getDate());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, newExam.getCourseID());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, newExam.geteID());
				
				
				preparedStatement.executeLargeUpdate();
				connection.commit();
				
			}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
				
				System.out.println(e.getMessage());
			}finally {
				
				try {
					
					if(connection != null) {
						
						connection.close();
					}
					
					if(preparedStatement != null) {
						
						preparedStatement.close();
					}
					
				}catch(SQLException e) {
					
					System.out.println(e.getMessage());
					log1.log(Level.SEVERE, e.getMessage());
					
				}
			}
		
	}

	
	//delete method
	@Override
	public void DeleteNewExam(String eID) {
		
		if(eID != null && !eID.isEmpty()) {
		
			try {
				
				connection = DBConnection.getConnection();
				
				preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_DELETE_NEWEXAM));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, eID);
				preparedStatement.execute();
				
			}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
				
				System.out.println(e.getMessage());
				
			}finally {
				
				try {
					
					if(connection != null) {
						
						connection.close();
					}
					
					if(preparedStatement != null) {
						
						preparedStatement.close();
					}
					
				}catch(SQLException e) {
					
					System.out.println(e.getMessage());
					log1.log(Level.SEVERE, e.getMessage());
					
					
				}
			}
			
		}
		
	}
	
	
	
	public ArrayList<String> getNewExamIds(){
		
		ArrayList <String> ids = new ArrayList <String>();
		
		try {
			
			connection = DBConnection.getConnection();
			
			preparedStatement = connection.prepareStatement(QueryUtil.queryById(CommonConstants.QUERY_ID_GET_NEWEXAM_IDS));
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				ids.add(rs.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
			
		}catch(SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}finally {
			
			try {
				
				if(connection != null) {
					
					connection.close();
				}
				
				if(preparedStatement != null) {
					
					preparedStatement.close();
				}
				
			}catch(SQLException e) {
				
				System.out.println(e.getMessage());
				log1.log(Level.SEVERE, e.getMessage());
				
			}
		}
		
		return ids;
		
	}
	
}


