package com.ahmetkizilay.yatlib4j.favorites;

import com.ahmetkizilay.yatlib4j.oauthhelper.OAuthHolder;

public class GetFavoritesList {
	private static final String BASE_URL = "https://api.twitter.com/1.1/favorites/list.json";
	private static final String HTTP_METHOD = "GET"; 
	
	public static GetFavoritesList.Response sendRequest(GetFavoritesList.Parameters params, OAuthHolder oauthHolder) {
		throw new UnsupportedOperationException();
	}	
	
	public static class Response {
		
	}
	
	public static class Parameters  {
		
	}
}
