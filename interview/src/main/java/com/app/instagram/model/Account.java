package com.app.instagram.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@JsonProperty("graphql")
	private AccountInfo accountInfo;
	
	public Account() {
		
	}
  
	public AccountInfo getAccountInfo() {
		return this.accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
  
	@Override
	public String toString() {
		return "Account {accountInfo=" + accountInfo + "}";
	}
}