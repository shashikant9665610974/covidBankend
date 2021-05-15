package com.covid.info.covidinfo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

//@JsonPropertyOrder({ "FIPS", "Admin2", "Province_State", "Country_Region", "Last_Update", "Lat", "Long_", "Confirmed",
//		"Deaths", "Recovered", "Active", "Combined_Key", "Incident_Rate", "Case_Fatality_Ratio" })
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@Builder
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class CvoidInfoDTO {
//
//	@JsonProperty("FIPS")
//	private String fips;
//	@JsonProperty("Admin2")
//	private String admin2;
//	@JsonProperty("Province_State")
//	private String provinceState;
//	@JsonProperty("Country_Region")
//	private String countryRegion;
//	@JsonProperty("Last_Update")
//	private String lastUpdate;
//	@JsonProperty("Lat")
//	private String lat;
//	@JsonProperty("Long_")
//	private String lng;
//	@JsonProperty("Confirmed")
//	private String confirmed;
//	@JsonProperty("Deaths")
//	private String deaths;
//	@JsonProperty("Recovered")
//	private String recovered;
//	@JsonProperty("Active")
//	private String Active;
//	@JsonProperty("Combined_Key")
//	private String combinedKey;
//	@JsonProperty("Incident_Rate")
//	private String incidentRate;
//	@JsonProperty("Case_Fatality_Ratio")
//	private String caseFatalityRatio;
//}
@Entity
@Table(name = "cvoidInfoDTO")
// Lombok annotations
// Causes lombok to generate toString(), equals(), hashCode(), getter() &
// setter(), and Required arguments constructor in one go.
//@Data
// Causes Lombok to implement the Builder design pattern for the Pojo class.
// Usage can be seen in DefaultBookLoader.java -> createNewBook() method.
//@Builder
// Causes Lombok to generate a constructor with no parameters.
//@NoArgsConstructor
// // Causes Lombok to generate a constructor with 1 parameter for each field in
// your class.
//@AllArgsConstructor
// Spring framework annotation
@Component
public class CvoidInfoDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "fips")
	private String fips;
	@Column(name = "admin2")
	private String admin2;
	@Column(name = "provinceState")
	private String provinceState;
	@Column(name = "countryRegion")
	private String countryRegion;
	@Column(name = "lastUpdate")
	private String lastUpdate;
	@Column(name = "lat")
	private String lat;
	@Column(name = "lng")
	private String lng;
	@Column(name = "confirmed")
	private String confirmed;
	@Column(name = "deaths")
	private String deaths;
	@Column(name = "recovered")
	private String recovered;
	@Column(name = "Active")
	private String Active;
	@Column(name = "combinedKey")
	private String combinedKey;
	@Column(name = "incidentRate")
	private String incidentRate;
	@Column(name = "caseFatalityRatio")
	private String caseFatalityRatio;

	public CvoidInfoDTO(long id, String fips, String admin2, String provinceState, String countryRegion,
			String lastUpdate, String lat, String lng, String confirmed, String deaths, String recovered, String active,
			String combinedKey, String incidentRate, String caseFatalityRatio) {
		super();
		this.id = id;
		this.fips = fips;
		this.admin2 = admin2;
		this.provinceState = provinceState;
		this.countryRegion = countryRegion;
		this.lastUpdate = lastUpdate;
		this.lat = lat;
		this.lng = lng;
		this.confirmed = confirmed;
		this.deaths = deaths;
		this.recovered = recovered;
		Active = active;
		this.combinedKey = combinedKey;
		this.incidentRate = incidentRate;
		this.caseFatalityRatio = caseFatalityRatio;
	}

	public CvoidInfoDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getAdmin2() {
		return admin2;
	}

	public void setAdmin2(String admin2) {
		this.admin2 = admin2;
	}

	public String getProvinceState() {
		return provinceState;
	}

	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	public String getCombinedKey() {
		return combinedKey;
	}

	public void setCombinedKey(String combinedKey) {
		this.combinedKey = combinedKey;
	}

	public String getIncidentRate() {
		return incidentRate;
	}

	public void setIncidentRate(String incidentRate) {
		this.incidentRate = incidentRate;
	}

	public String getCaseFatalityRatio() {
		return caseFatalityRatio;
	}

	public void setCaseFatalityRatio(String caseFatalityRatio) {
		this.caseFatalityRatio = caseFatalityRatio;
	}

}
