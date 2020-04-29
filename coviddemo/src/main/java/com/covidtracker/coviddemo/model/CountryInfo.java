package com.covidtracker.coviddemo.model;

public class CountryInfo {

	String Slug;
    String ISO2;
	String Country;
    public String getCountry() {
		return Country;
	}
	@Override
	public String toString() {
		return "CountryInfo [Slug=" + Slug + ", ISO2=" + ISO2 + ", Country=" + Country + ", getCountry()="
				+ getCountry() + ", getSlug()=" + getSlug() + ", getISO2()=" + getISO2() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getISO2() {
		return ISO2;
	}
	public void setISO2(String iSO2) {
		ISO2 = iSO2;
	}
	 
}
