package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Payment;


public class PaymentDBUtil {

	private static Connection con = null;
	private static Statement state = null;
	private static ResultSet rs  = null;

	public static List<Payment> ValidatePaymentDetails(String PID){
		ArrayList<Payment> pay = new ArrayList<>();
		
		//validate part
		
		try {
			
			con = DBConnection.getConnection();
			state = con.createStatement();
			String Sql = "select * from paymentinfo where PID='"+PID+"'";
			
			rs = state.executeQuery(Sql);
			
			//next() is a boolean method
			if(rs.next()) {
				int PID1 = rs.getInt(1);
				String name= rs.getString(2);
				String number= rs.getString(3);
				String expiry_date= rs.getString(4);
				String cvv= rs.getString(5);
				
			
				
				Payment Payment1 =  new Payment(PID1,name,number,expiry_date,cvv);
				
				pay.add(Payment1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		return pay;
		
	}
	
	public static boolean insertPayment(String name,String number,String expiry_date,String cvv) {
		boolean isSuccess = false;
		
		
				try {
					con =  DBConnection.getConnection();
					state = con.createStatement();
					
					String sql = "insert into paymentinfo values(0,'"+name+"','"+number+"','"+expiry_date+"','"+cvv+"')";
					//we have to use executeUpdate method to insert query and use a int variable -- 1 = succes 0= unsuccess
					int rs=state.executeUpdate(sql);
					
					if(rs>0) {
						isSuccess=true;
					}else {
						isSuccess=false;
					}
					
				}
				catch(Exception e){
					e.printStackTrace();
					
				}
				
				
				
				return isSuccess;
	}
	
	//update
	public static boolean updatePayment(String PID,String name,String number,String expiry_date,String cvv) {
		boolean isSuccess = false;
		try{
			con =  DBConnection.getConnection();
			state = con.createStatement();
			String sql = "update paymentinfo set name = '"+name+"', number = '"+number+"', expiry_date = '"+expiry_date+"', cvv = '"+cvv+"' where PID = '"+PID+"'" ;
			
			int rs = state.executeUpdate(sql);
			if(rs>0)
			{
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	return isSuccess;
	}
	
	//retrieve
	
	public static List<Payment> getPaymentDetails(String PID){
		int convertedEid = Integer.parseInt(PID);
		
		
		ArrayList<Payment> pay = new ArrayList<>();
		
		try {
			con =  DBConnection.getConnection();
			state = con.createStatement();
			String sql = "select * from paymentinfo where PID = '"+PID+"'" ;
			rs = state.executeQuery(sql);
			
			while(rs.next()) {
				
				int PID1 = rs.getInt(1);
				String name= rs.getString(2);
				String number= rs.getString(3);
				String expiry_date= rs.getString(4);
				String cvv= rs.getString(5);
				
				
				Payment Payment1 = new Payment(PID1,name,number,expiry_date,cvv);
				pay.add(Payment1);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return pay;
		
	}
	
	
	
	//delete

	public static boolean deletePayment1(String PID) {
		
		int convertedEid= Integer.parseInt(PID);
		boolean isSuccess = false;
		
		
		try {
			
			con =  DBConnection.getConnection();
			state = con.createStatement();
			String sql = "delete from paymentinfo where PID = '"+convertedEid+"'" ;
			int r = state.executeUpdate(sql);
			
			if(r>0) {
				isSuccess=true;
			}else {
				isSuccess =false;
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
