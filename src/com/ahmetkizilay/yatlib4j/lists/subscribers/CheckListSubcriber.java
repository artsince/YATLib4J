package com.ahmetkizilay.yatlib4j.lists.subscribers;

import com.ahmetkizilay.yatlib4j.oauthhelper.OAuthHolder;

public class CheckListSubcriber {
	private static final String BASE_URL = "https://api.twitter.com/1.1/lists/subscribers/show.json";
	private static final String HTTP_METHOD = "GET"; 
	
	public static CheckListSubcriber.Response sendRequest(CheckListSubcriber.Parameters params, OAuthHolder oauthHolder) {
		throw new UnsupportedOperationException();
	}	
	
	public static class Response {
		
	}
	
	public static class Parameters  {
		
	}
}
