package com.ahmetkizilay.yatlib4j.savedsearches;

import com.ahmetkizilay.yatlib4j.oauthhelper.OAuthHolder;

public class CreateSavedSearch {
	private static final String BASE_URL = "https://api.twitter.com/1.1/saved_searches/create.json";
	private static final String HTTP_METHOD = "POST"; 
	
	public static CreateSavedSearch.Response sendRequest(CreateSavedSearch.Parameters params, OAuthHolder oauthHolder) {
		throw new UnsupportedOperationException();
	}	
	
	public static class Response {
		
	}
	
	public static class Parameters  {
		
	}
}
