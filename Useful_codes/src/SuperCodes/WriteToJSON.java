package SuperCodes;

import org.json.simple.JSONObject;

public class WriteToJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		obj.put("name", "OK");
		obj.put("name1", "OK1");
		obj.put("name2", "OK2");
		
		System.out.println(obj);

	}

}
