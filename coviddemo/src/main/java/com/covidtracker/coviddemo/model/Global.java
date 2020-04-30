package com.covidtracker.coviddemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Global {
	int NewConfirmed;
	int  TotalConfirmed;
	int  NewDeaths;
	int  TotalDeaths;
	int  NewRecovered;
	int  TotalRecovered;
	@JsonProperty("NewConfirmed")
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	@JsonProperty("NewConfirmed")
	public void setNewConfirmed(int newConfirmed) {
		NewConfirmed = newConfirmed;
	}
	@JsonProperty("TotalConfirmed")
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	@JsonProperty("TotalConfirmed")
	public void setTotalConfirmed(int totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}
	@JsonProperty("NewDeaths")
	public int getNewDeaths() {
		return NewDeaths;
	}
	@JsonProperty("NewDeaths")
	public void setNewDeaths(int newDeaths) {
		NewDeaths = newDeaths;
	}
	@JsonProperty("TotalDeaths")
	public int getTotalDeaths() {
		return TotalDeaths;
	}
	@JsonProperty("TotalDeaths")
	public void setTotalDeaths(int totalDeaths) {
		TotalDeaths = totalDeaths;
	}
	@JsonProperty("NewRecovered")
	public int getNewRecovered() {
		return NewRecovered;
	}
	@JsonProperty("NewRecovered")
	public void setNewRecovered(int newRecovered) {
		NewRecovered = newRecovered;
	}
	@JsonProperty("TotalRecovered")
	public int getTotalRecovered() {
		return TotalRecovered;
	}
	@JsonProperty("TotalRecovered")
	public void setTotalRecovered(int totalRecovered) {
		TotalRecovered = totalRecovered;
	}
	@Override
	public String toString() {
		return "Global [NewConfirmed=" + NewConfirmed + ", TotalConfirmed=" + TotalConfirmed + ", NewDeaths="
				+ NewDeaths + ", TotalDeaths=" + TotalDeaths + ", NewRecovered=" + NewRecovered + ", TotalRecovered="
				+ TotalRecovered + "]";
	}
    
}