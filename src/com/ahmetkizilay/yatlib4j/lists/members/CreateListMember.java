package com.ahmetkizilay.yatlib4j.lists.members;

import com.ahmetkizilay.yatlib4j.oauthhelper.OAuthHolder;

public class CreateListMember {
	private static final String BASE_URL = "https://api.twitter.com/1.1/lists/members/create.json";
	private static final String HTTP_METHOD = "POST"; 
	
	public static CreateListMember.Response sendRequest(CreateListMember.Parameters params, OAuthHolder oauthHolder) {
		throw new UnsupportedOperationException();
	}	
	
	public static class Response {
		
	}
	
	public static class Parameters  {
		
	}
}
