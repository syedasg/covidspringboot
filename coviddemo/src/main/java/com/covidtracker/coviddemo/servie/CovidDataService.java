package com.covidtracker.coviddemo.servie;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import javax.annotation.PostConstruct;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.covidtracker.coviddemo.model.Global;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.JSONObject;
import com.covidtracker.coviddemo.model.*;



@Service
public class CovidDataService
{
	
//@Autowired
private com.covidtracker.coviddemo.model.SummaryModel summary=new SummaryModel() ;
private CountryInfo countryinfo=new CountryInfo();



@PostConstruct 
public void fetchVirusData() throws IOException, InterruptedException
{
//HttpClient client = HttpClientBuilder.create().build(); 
//HttpResponse response = client.execute(new HttpGet(SAMPLE_URL));
		String countrywiseData="https://api.covid19api.com/countries";
		String summaryData="https://api.covid19api.com/summary";
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(summaryData))
         .build();

HttpResponse<String> httpResponse = client.send(request, BodyHandlers.ofString());
 System.out.println(httpResponse.statusCode());
 System.out.println(httpResponse.body());
 
 ObjectMapper objectMapper = new ObjectMapper();
 //configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

 //read json file and convert to customer object
 summary = objectMapper.readValue(httpResponse.body(), SummaryModel.class);
  System.out.println(summary);
  
}}


/*
	      public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, String.class);
	         */
	 //Asynchronous call     
	/*WebClient client1 = WebClient
	 * .builder()
	        		  			.baseUrl("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=INFY.NS&interval=1min&apikey=DM3P5MNMBKC2U7O6")
	        		  			.defaultCookie("cookieKey", "cookieValue")
	        		  			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) 
	        		  			.defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
	        		  			.build();*/
	

    /* JSONObject jsonObj = new JSONObject(httpResponse.body());
     public enum Headers {
    	    ID, CustomerNo, Name
    	}
    	Reader in = new FileReader("path/to/file.csv");
    	Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader(Headers.class).parse(in);
    	for (CSVRecord record : records) {
    	    String id = record.get(Headers.ID);
    	    String customerNo = record.get(Headers.CustomerNo);
    	    String name = record.get(Headers.Name);
    	}*/


	        		  			
	
	/*String url =" https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
			+ "INFY.NS&interval=1min&apikey=DM3P5MNMBKC2U7O6";
    System.out.println(this.restTemplate.getForObject(url, String.class));*/


