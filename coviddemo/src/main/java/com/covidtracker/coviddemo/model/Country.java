package com.covidtracker.coviddemo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Countries {


              
                String Country;
                String countryCode;
                String Slug;
                int NewConfirmed;
                int TotalConfirmed;
                int NewDeaths; 
                int TotalDeaths;
                int NewRecovered;
                int TotalRecovered;
                String date;
                @JsonProperty("Country")
				public String getCountry() {
					return Country;
				}
                @JsonProperty("Country")
				public void setCountry(String country) {
					Country = country;
				}
                @JsonProperty("CountryCode")
				public String getCountryCode() {
					return CountryCode;
				}
                @JsonProperty("CountryCode")
				public void setCountryCode(String countryCode) {
					CountryCode = countryCode;
				}
                @JsonProperty("Slug")
				public String getSlug() {
					return Slug;
				}
                @JsonProperty("Slug")
				public void setSlug(String slug) {
					Slug = slug;
				}
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
                @JsonProperty("Date")
				public String getDate() {
					return date;
				}
                @JsonProperty("Date")
				public void setDate(String date) {
					this.date = date;
				}
				@Override
				public String toString() {
					return "Countries [Country=" + Country + ", CountryCode=" + CountryCode + ", Slug=" + Slug
							+ ", NewConfirmed=" + NewConfirmed + ", TotalConfirmed=" + TotalConfirmed + ", NewDeaths="
							+ NewDeaths + ", TotalDeaths=" + TotalDeaths + ", NewRecovered=" + NewRecovered
							+ ", TotalRecovered=" + TotalRecovered + ", date=" + date + "]";
				}
                
}