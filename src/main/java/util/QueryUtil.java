package util;

import java.io.File;

import java.io.IOException;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class QueryUtil extends CommonUtil{

	//new exam
	public static String queryById(String id) throws SAXException, IOException, ParserConfigurationException{
		
		NodeList nodeList;
		Element element = null;
		
		// parse queies.XML 
		nodeList = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(new File(System.getProperty("catalina.base") + "\\wtpwebapps\\Examify\\WEB-INF\\queries.xml"))
				.getElementsByTagName(CommonConstants.TAG_NAME);
		
		// Iterate over the node list and match the query ID
		for(int value = 0; value < nodeList.getLength(); value++) {
			
			element = (Element) nodeList.item(value);
			
			if(element.getAttribute(CommonConstants.ATTRIB_NAME).equals(id)) {
				break;
			}
		}
		
		return element.getTextContent().trim();
	}
	
	
	//new examiner
	public static String queryByID(String id) throws SAXException, IOException, ParserConfigurationException {

	    NodeList nodeList;
	    Element element = null;

	    // Parse the ExaminerQuery.xml file and retrieve the query node list
	    nodeList = DocumentBuilderFactory.newInstance()
	            .newDocumentBuilder()
	            .parse(new File(System.getProperty("catalina.base") + "\\wtpwebapps\\ExaminerInfo\\WEB-INF\\ExaminerQuery.xml"))
	            .getElementsByTagName(CommonConstants.TAG_NAME);

	    // Iterate over the node list and match the query ID
	    for (int value = 0; value < nodeList.getLength(); value++) {
	        element = (Element) nodeList.item(value);
	        
	        // Check if the current element has the correct attribute (id)
	        if (element.getAttribute(CommonConstants.ATTRIB_ID).equals(id)) {
	            break;
	        }
	    }

	    // Return the text content of the found element
	    if (element != null) {
	        return element.getTextContent().trim();
	    } else {
	        throw new IllegalArgumentException("No query found for the provided ID: " + id);
	    }
	}
	
}
	
	


	