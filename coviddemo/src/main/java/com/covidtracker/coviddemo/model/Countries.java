package com.covidtracker.coviddemo.model;

import java.util.Date;

public class Countries {


              
                String Country;
                String CountryCode;
                String Slug;
                int NewConfirmed;
                int TotalConfirmed;
                int NewDeaths;
                int TotalDeaths;
                int NewRecovered;
                int TotalRecovered;
                String date;
				public String getCountry() {
					return Country;
				}
				public void setCountry(String country) {
					Country = country;
				}
				public String getCountryCode() {
					return CountryCode;
				}
				public void setCountryCode(String countryCode) {
					CountryCode = countryCode;
				}
				public String getSlug() {
					return Slug;
				}
				public void setSlug(String slug) {
					Slug = slug;
				}
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
				public String getDate() {
					return date;
				}
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