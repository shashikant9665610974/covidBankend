package com.covid.info.covidinfo.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class FinalData {

	private List<String> date;
	private long activeCase = 0;
	private long confirmedCase = 0;
	private long deathCase = 0;
	private long recoveryCase = 0;
	private long incidentRatio = 0;
	private long caseFacilityRatio = 0;
	private Set<String> countryRegion = new HashSet<String>();
	private Set<String> provisionState = new HashSet<String>();
	private Set<String> cityAdmin = new HashSet<String>();
	private Set<String> cityStateCountry = new HashSet<String>();

	public List<String> getDate() {
		return date;
	}

	public void setDate(List<String> date) {
		this.date = date;
	}

	public long getActiveCase() {
		return activeCase;
	}

	public void setActiveCase(long activeCase) {
		this.activeCase = activeCase;
	}

	public long getConfirmedCase() {
		return confirmedCase;
	}

	public void setConfirmedCase(long confirmedCase) {
		this.confirmedCase = confirmedCase;
	}

	public long getDeathCase() {
		return deathCase;
	}

	public void setDeathCase(long deathCase) {
		this.deathCase = deathCase;
	}

	public long getRecoveryCase() {
		return recoveryCase;
	}

	public void setRecoveryCase(long recoveryCase) {
		this.recoveryCase = recoveryCase;
	}

	public long getIncidentRatio() {
		return incidentRatio;
	}

	public void setIncidentRatio(long incidentRatio) {
		this.incidentRatio = incidentRatio;
	}

	public long getCaseFacilityRatio() {
		return caseFacilityRatio;
	}

	public void setCaseFacilityRatio(long caseFacilityRatio) {
		this.caseFacilityRatio = caseFacilityRatio;
	}

	public Set<String> getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(Set<String> countryRegion) {
		this.countryRegion = countryRegion;
	}

	public Set<String> getProvisionState() {
		return provisionState;
	}

	public void setProvisionState(Set<String> provisionState) {
		this.provisionState = provisionState;
	}

	public Set<String> getCityAdmin() {
		return cityAdmin;
	}

	public void setCityAdmin(Set<String> cityAdmin) {
		this.cityAdmin = cityAdmin;
	}

	public Set<String> getCityStateCountry() {
		return cityStateCountry;
	}

	public void setCityStateCountry(Set<String> cityStateCountry) {
		this.cityStateCountry = cityStateCountry;
	}

	public FinalData(List<String> date, long activeCase, long confirmedCase, long deathCase, long recoveryCase,
			long incidentRatio, long caseFacilityRatio, Set<String> countryRegion, Set<String> provisionState,
			Set<String> cityAdmin, Set<String> cityStateCountry) {
		super();
		this.date = date;
		this.activeCase = activeCase;
		this.confirmedCase = confirmedCase;
		this.deathCase = deathCase;
		this.recoveryCase = recoveryCase;
		this.incidentRatio = incidentRatio;
		this.caseFacilityRatio = caseFacilityRatio;
		this.countryRegion = countryRegion;
		this.provisionState = provisionState;
		this.cityAdmin = cityAdmin;
		this.cityStateCountry = cityStateCountry;
	}

	public FinalData() {
	}
}
