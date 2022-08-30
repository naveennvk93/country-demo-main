package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CountryApiController {
	
	@Autowired
	private RestTemplate restTemplate; 
	
	private static String url = "https://countriesnow.space/api/v0.1/countries";
	
	@GetMapping(value="/countries")
	public CountryResponse getCountries() {
		
		CountryResponse countries = restTemplate.getForObject(url, CountryResponse.class);
		
		//ResponseEntity<Response> countries = restTemplate.getForObject(uri, Response.class);
				
		return countries;
	}
	
	@GetMapping(value="/countries/states")
	public StateResponse getStates() {
		
		StateResponse states = restTemplate.getForObject(url+"/states", StateResponse.class);
		
		return states;
	}
	
	@GetMapping(value="/countries/capital")
	public CapitalResponse getCapital() {
		
		CapitalResponse capital = restTemplate.getForObject(url+"/capital", CapitalResponse.class);
		
		return capital;
	}
	
	@GetMapping(value="/countries/currency")
	public CurrenciesResponse getCurrencies() {
		
		CurrenciesResponse currency = restTemplate.getForObject(url+"/currency",  CurrenciesResponse.class);
		
		return currency;
	}
	
	@PostMapping(value = "/countries/cities")
	public CityResponse getCities(@RequestBody CountryInput input) {
		
		CityResponse cities = restTemplate.postForObject(url+"/cities", input, CityResponse.class);
		
		return cities;
	}
	
	@PostMapping(value = "/countries/capital")
	public PostCapitalResponse getCapital(@RequestBody Capital input) {
		
		PostCapitalResponse capital = restTemplate.postForObject(url+"/capital", input, PostCapitalResponse.class);
		
		return capital;
	}
}
