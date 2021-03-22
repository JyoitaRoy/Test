package api_01.mvnProject;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test1 {
  
	@Test
	public void test_1()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
	}
}
