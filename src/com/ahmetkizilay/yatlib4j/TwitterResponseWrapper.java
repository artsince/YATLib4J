package com.ahmetkizilay.yatlib4j;

public class TwitterResponseWrapper {
	private boolean mSuccess;
	private int mResponseCode;
	private String mResponse;
	
	public boolean isSuccess() {
		return this.mSuccess;
	}
	
	public void setSuccess(boolean success) {
		this.mSuccess = success;
	}
	
	public int getResponseCode() {
		return this.mResponseCode;
	}
	
	public void setResponseCode(int responseCode) {
		this.mResponseCode = responseCode;
	}
	
	public String getResponse() {
		return this.mResponse;
	}
	
	public void setResponse(String response) {
		this.mResponse = response;
	}
}
