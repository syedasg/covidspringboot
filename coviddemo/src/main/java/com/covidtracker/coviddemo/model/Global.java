package com.covidtracker.coviddemo.model;

public class Global {
	int NewConfirmed;
	int  TotalConfirmed;
	int  NewDeaths;
	int  TotalDeaths;
	int  NewRecovered;
	int  TotalRecovered;
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	public void setNewConfirmed(int newConfirmed) {
		NewConfirmed = newConfirmed;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
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
	@Override
	public String toString() {
		return "Global [NewConfirmed=" + NewConfirmed + ", TotalConfirmed=" + TotalConfirmed + ", NewDeaths="
				+ NewDeaths + ", TotalDeaths=" + TotalDeaths + ", NewRecovered=" + NewRecovered + ", TotalRecovered="
				+ TotalRecovered + "]";
	}
    
}