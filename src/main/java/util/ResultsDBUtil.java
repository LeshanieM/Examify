// IT23149380 - P.G.T.N.D.Gallage 

package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Results;


public class ResultsDBUtil {
	
	private static boolean isSuccess;
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String studentID) {
		
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from results where studentID='"+studentID+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Results> getResults(String studentId) {
		
		ArrayList<Results> results = new ArrayList<>();
		
		try {
			
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from results where studentID='"+studentId+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int RID = rs.getInt(1);
				String studentID = rs.getString(2);
				String examID = rs.getString(3);
				int marks = rs.getInt(4);
				String grade = rs.getString(5);
				
				Results res = new Results(RID, studentID, examID, marks, grade);
				results.add(res);
			}
			
		} catch (Exception e) {
			
		}
		
		return results;	
	}
	
	public static boolean insertResults(String studentID, String examID, int marks, String grade) {
		
		boolean isSuccess = false;
		
		try {			
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			
			String sql = "insert into results values (0, '"+studentID+"', '"+examID+"', '"+marks+"', '"+grade+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();	
		}
		
		return isSuccess;
	}
	
	public static boolean updateResults(String RID, String studentID, String examID, String marks, String grade) {
    	
    	try {
    		
    		conn =DBConnection.getConnection();
    		stmt = conn.createStatement();
    		String sql = "update results set studentID='"+studentID+"',examID='"+examID+"',marks='"+marks+"',grade='"+grade+"'"
    				+ "where RID='"+RID+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    public static List<Results> getResultsDetails(String rID) {
    	
    	int convertedRID = Integer.parseInt(rID);
    	
    	ArrayList<Results> res = new ArrayList<>();
    	
    	try {
    		
    		conn = DBConnection.getConnection();
    		stmt = conn.createStatement();
    		String sql = "select * from results where RID='"+convertedRID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int RID = rs.getInt(1);
    			String studentID = rs.getString(2);
    			String examID = rs.getString(3);
    			int marks = rs.getInt(4);
    			String grade = rs.getString(5);
    			
    			Results r = new Results(RID, studentID, examID, marks, grade);
    			res.add(r);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return res;	
    }
    
    
    public static boolean deleteResults(String RID) {
    	
    	int convertRID = Integer.parseInt(RID);
    	
    	try {
    		
    		conn = DBConnection.getConnection();
    		stmt = conn.createStatement();
    		String sql = "delete from results where RID='"+convertRID+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if (rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

}

