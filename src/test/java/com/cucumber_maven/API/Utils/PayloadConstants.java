package com.cucumber_maven.API.Utils;

import org.json.JSONObject;



public class PayloadConstants {
	

	/**
	 * This method instantiate an object of JSONObject collection
	 * stores objects in key value pairs 
	 * @return : returns the collection in string format
	 */
	
	public static String creatEmployeePayload() {	
		JSONObject obj = new JSONObject();
		
		obj.put("emp_firstname", "xyzFirstName");
		obj.put("emp_lastname", "xyzLastName");
		obj.put("emp_middle_name", "xyzMiddleName");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "2000-07-11");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Cloud Architect");		
		return obj.toString();	
	}
	/**
	 * This method will updated current resources at the end point 
	 * To reduce messy code
	 * @return: the updated payload in string format
	 */
	public static String updateCreatedEmpBody() {		
		String updateBody = "{\n" + "  \"employee_id\": \"" + "Pass the employee ID"+ "\",\n"
				+ "  \"emp_firstname\": \"xyzFirstName\",\n"
				+ "  \"emp_lastname\": \"xyzLastName\",\n"
				+ "  \"emp_middle_name\": \"xyzMiddleName\",\n" + "  \"emp_gender\": \"F\",\n"
				+ "  \"emp_birthday\": \"2000-07-11\",\n" + "  \"emp_status\": \"Employee\",\n"
				+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}";
				return updateBody;
	}
	

}
