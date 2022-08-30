package com.example.demo;

public class CurrenciesResponse extends Response{

	private Currencies[] data;
	
	public Currencies[] getData() {
		return data;
	}
	
	public void setData(Currencies[] data) {
		this.data = data;
	}
	
}