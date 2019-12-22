package codeDay8;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	// english to spanish dictionary
	
	public static void main(String[] args) {
		Map<String,String> engSpanDic =new HashMap<String,String>();
		// putting things in dictinary
		engSpanDic.put("Monday", "Lunes");
		engSpanDic.put("Tuesday","Martes");
		engSpanDic.put("Wednesday","Miercoles");
		engSpanDic.put("Thursday", "Jueves");
		engSpanDic.put("Friday","Viernes");
	// Retirieving the values
		
		System.out.println(engSpanDic.get("Monday"));
		System.out.println(engSpanDic.get("Tuesday"));

		System.out.println(engSpanDic.get("Wednesday"));
		System.out.println(engSpanDic.get("Thursday"));
		System.out.println(engSpanDic.get("Friday"));

		System.out.println(engSpanDic.keySet());
		System.out.println(engSpanDic.values());
		System.out.println(engSpanDic.size());

		
		System.out.println("=========================");
		
		Map<String, Boolean> sList=new HashMap<String,Boolean>();
		//put some stuff in dictionary
		
		sList.put("Ham",true);
		sList.put("Bread",Boolean.FALSE);
		sList.put("Oreos",Boolean.TRUE);
		sList.put("Eggs", false);
		sList.put("Sugar",false);
		
		System.out.println(sList.get("Ham"));
		System.out.println(sList.get("Sugar"));
		
		// key value paitrs print 
		
		System.out.println(sList.toString());
		System.out.println(sList.isEmpty());
		// Clear Dictionary
		//sList.clear();
		System.out.println(sList.toString());
		System.out.println(sList.isEmpty());
		
		sList.remove("Ham");
		System.out.println(sList.toString());
		
		sList.replace("Bread", true);
		System.out.println(sList.toString());
		
	}
}

