package com.covidtracker.coviddemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryModel {

    @JsonProperty("Global")
    private Global global;

    @JsonProperty("Countries")
    private List<Country> countries;

    @JsonProperty("Date")
    private String date;

    public void setGlobal(Global global) {
        this.global = global;
    }

    public Global getGlobal() {
        return this.global;
    }

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return "SummaryModel [global=" + global + ", countries=" + countries + "]";
	}
}
