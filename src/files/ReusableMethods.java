package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {

	
	public static  JsonPath rawToJson(String response)
	{
		JsonPath js1 =new JsonPath(response);
		return js1;
	}

/*public static   JsonPath rawToJson(Response resp) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(resp);
		return js;
	}*/


}
