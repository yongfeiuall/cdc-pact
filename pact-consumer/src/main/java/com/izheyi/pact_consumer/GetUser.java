package com.izheyi.pact_consumer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


public class GetUser{
	int port = 8080;
	

	public GetUser(String url) {
		// TODO Auto-generated constructor stub
	}
	
	public GetUser() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String user = new GetUser().getUser();
		System.out.println("User is: " + user);
	}
	
	public String getUser() {
		
		try {
			String url = String.format("http://localhost:%d/user", port);
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
			return json;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
	
}
