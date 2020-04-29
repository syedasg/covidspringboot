package com.covidtracker.coviddemo.model;

import java.util.List;
import com.covidtracker.coviddemo.model.Global;
import com.covidtracker.coviddemo.model.Countries;

public class SummaryModel {
	//private Global global;
	int NewConfirmed;
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	public void setNewConfirmed(int newConfirmed) {
		NewConfirmed = newConfirmed;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	@Override
	public String toString() {
		return "SummaryModel [NewConfirmed=" + NewConfirmed + ", TotalConfirmed=" + TotalConfirmed + ", NewDeaths="
				+ NewDeaths + ", TotalDeaths=" + TotalDeaths + ", NewRecovered=" + NewRecovered + ", TotalRecovered="
				+ TotalRecovered + ", countries=" + countries + ", date=" + date + "]";
	}
	public void setTotalConfirmed(int totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}
	public int getNewDeaths() {
		return NewDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		NewDeaths = newDeaths;
	}
	public int getTotalDeaths() {
		return TotalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		TotalDeaths = totalDeaths;
	}
	public int getNewRecovered() {
		return NewRecovered;
	}
	public void setNewRecovered(int newRecovered) {
		NewRecovered = newRecovered;
	}
	public int getTotalRecovered() {
		return TotalRecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		TotalRecovered = totalRecovered;
	}
	int  TotalConfirmed;
	int  NewDeaths;
	int  TotalDeaths;
	int  NewRecovered;
	int  TotalRecovered;
	private List<Countries> countries;
	private String date;
public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	/*public String toString() {
		return "SummaryModel [global=" + global + ", countries=" + countries + "]";
	}
public Global getGlobal() {
		return global;
	}
	public void setGlobal(Global global) {
		this.global = global;
	}*/
	public List<Countries> getCountries() {
		return countries;
	}
	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

}
