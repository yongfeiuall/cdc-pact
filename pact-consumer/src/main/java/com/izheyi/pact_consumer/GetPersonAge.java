package com.izheyi.pact_consumer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


public class GetPersonAge{
	int port = 8080;
	
	public GetPersonAge(String url) {
		// TODO Auto-generated constructor stub
	}

	public GetPersonAge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Integer age = new GetPersonAge().checkAge("zhangsan");
		System.out.println("Age is: " + age);
	}
	
	public Integer checkAge(String name) {
		
		try {
			String url = String.format("http://localhost:%d/person/%s", port, name);
			System.out.println("URL is: " + url);
			
			HttpClient httpclient = new DefaultHttpClient();
			HttpGet httpget = new HttpGet(url);
			String json = null;

			HttpResponse response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				json = EntityUtils.toString(entity, "UTF-8").trim();
 
			}

			System.out.println("Json is: "  + json);
			JSONObject jsonObject = new JSONObject(json);
			String age = jsonObject.get("age").toString();
			return new Integer(age);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
	
}
