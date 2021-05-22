package com.app.instagram.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();
	String dateTime = dtf.format(now);
	@JsonProperty("graphql")
	private AccountInfo accountInfo;
	
	public Account() {
		
	}
	
	public String getDateTime() {
		return dateTime;
	}



	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}



	public AccountInfo getAccountInfo() {
		return this.accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
  
	@Override
	public String toString() {
		return "Account {dateTime=" + dateTime + ", accountInfo=" + accountInfo + "}";
	}
}