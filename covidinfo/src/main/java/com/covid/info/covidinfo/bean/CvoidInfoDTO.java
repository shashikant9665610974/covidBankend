package com.covid.info.covidinfo.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

//@JsonPropertyOrder({ "FIPS", "Admin2", "Province_State", "Country_Region", "Last_Update", "Lat", "long_", "Confirmed",
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
//	@JsonProperty("long_")
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
// @Data
// Causes Lombok to implement the Builder design pattern for the Pojo class.
// Usage can be seen in DefaultBookLoader.java -> createNewBook() method.
// @Builder
// Causes Lombok to generate a constructor with no parameters.
// @NoArgsConstructor
// // Causes Lombok to generate a constructor with 1 parameter for each field in
// your class.
// @AllArgsConstructor
// Spring framework annotation
@Component
public class CvoidInfoDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long id;
	@Column(name = "fips")
	@JsonInclude(Include.NON_NULL)
	private long fips;
	@Column(name = "admin2")
	@JsonInclude(Include.NON_NULL)
	private String admin2;
	@Column(name = "provinceState")
	@JsonInclude(Include.NON_NULL)
	private String provinceState;
	@Column(name = "countryRegion")
	@JsonInclude(Include.NON_NULL)
	private String countryRegion;
	@Column(name = "lastUpdate")
	@JsonInclude(Include.NON_NULL)
	private String lastUpdate;
	@Column(name = "lat")
	@JsonInclude(Include.NON_DEFAULT)
	private float lat;
	@Column(name = "lng")
	@JsonInclude(Include.NON_DEFAULT)
	private float lng;
	@Column(name = "confirmed")
	@JsonInclude(Include.NON_DEFAULT)
	private long confirmed;
	@Column(name = "deaths")
	@JsonInclude(Include.NON_DEFAULT)
	private long deaths;
	@Column(name = "recovered")
	@JsonInclude(Include.NON_DEFAULT)
	private long recovered;
	@Column(name = "Active")
	@JsonInclude(Include.NON_DEFAULT)
	private long Active;
	@Column(name = "combinedKey")
	@JsonInclude(Include.NON_DEFAULT)
	private String combinedKey;
	@Column(name = "incidentRate")
	@JsonInclude(Include.NON_DEFAULT)
	private float incidentRate;
	@Column(name = "caseFatalityRatio")
	@JsonInclude(Include.NON_DEFAULT)
	private float caseFatalityRatio;

	public CvoidInfoDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFips() {
		return fips;
	}

	public void setFips(long fips) {
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

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLng() {
		return lng;
	}

	public void setLng(float lng) {
		this.lng = lng;
	}

	public long getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(long confirmed) {
		this.confirmed = confirmed;
	}

	public long getDeaths() {
		return deaths;
	}

	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}

	public long getRecovered() {
		return recovered;
	}

	public void setRecovered(long recovered) {
		this.recovered = recovered;
	}

	public long getActive() {
		return Active;
	}

	public void setActive(long active) {
		Active = active;
	}

	public String getCombinedKey() {
		return combinedKey;
	}

	public void setCombinedKey(String combinedKey) {
		this.combinedKey = combinedKey;
	}

	public float getIncidentRate() {
		return incidentRate;
	}

	public void setIncidentRate(float incidentRate) {
		this.incidentRate = incidentRate;
	}

	public float getCaseFatalityRatio() {
		return caseFatalityRatio;
	}

	public void setCaseFatalityRatio(float caseFatalityRatio) {
		this.caseFatalityRatio = caseFatalityRatio;
	}

	public CvoidInfoDTO(long id, long fips, String admin2, String provinceState, String countryRegion,
			String lastUpdate, float lat, float lng, long confirmed, long deaths, long recovered, long active,
			String combinedKey, float incidentRate, float caseFatalityRatio) {
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

}
