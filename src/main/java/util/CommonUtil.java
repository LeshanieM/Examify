package util;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import service.IExaminerService;
import service.INewExamService;

public class CommonUtil {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(IExaminerService.class.getName());
	public static final Logger log1 = Logger.getLogger(INewExamService.class.getName());

	public static final Properties properties = new Properties();


	static {
		try {
			
			// Read the property only once when load the class
			properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
			
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
	


	/**  new exam */
public static String generateNewExamIds(ArrayList<String> ids) {
	
	String id;
	
	int next = ids.size();
	
	id = CommonConstants.NEWEXAM_PREFIX + next ; 
	
	if(ids.contains(id)) {
		
		next++;
		
		id = CommonConstants.NEWEXAM_PREFIX + next ;
		
	}
	
	return id;
	
}




/** examiner */

public static String generateIDs(ArrayList<String> arrayList) {

	String id;
	int next = arrayList.size();
	next++;
	id = CommonConstants.EXAMINER_ID_PREFIX + next;
	if (arrayList.contains(id)) {
		next++;
		id = CommonConstants.EXAMINER_ID_PREFIX + next;
	}
	return id;
}
}