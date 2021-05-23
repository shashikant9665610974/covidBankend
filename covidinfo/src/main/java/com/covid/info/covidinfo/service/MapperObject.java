package com.covid.info.covidinfo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;

@Component
public class MapperObject {

	long activeCase = 0;
	long confirmedCase = 0;
	long deathCase = 0;
	long recoveryCase = 0;
	long incidentRatio = 0;
	long caseFacilityRatio = 0;
	
	
	Set<String> countryRegion = new HashSet<String>();
	Set<String> provisionState = new HashSet<String>();
	Set<String> cityAdmin = new HashSet<String>();
	Set<String> cityStateCountry = new HashSet<String>();

	public CvoidInfoDTO mappingCountryStateCity(String name, List<CvoidInfoDTO> cvoidInfoDTOList) {

		CvoidInfoDTO cvoidInfoDTO = new CvoidInfoDTO();
		for (int i = 0; i <= cvoidInfoDTOList.size() - 1; i++) {
			if (name.equalsIgnoreCase(cvoidInfoDTOList.get(i).getAdmin2()) || (name.equalsIgnoreCase("overAllCase")
					|| name.equalsIgnoreCase(cvoidInfoDTOList.get(i).getCountryRegion())
					|| name.equalsIgnoreCase(cvoidInfoDTOList.get(i).getProvinceState()))) {
				activeCase += cvoidInfoDTOList.get(i).getActive();
				confirmedCase += cvoidInfoDTOList.get(i).getConfirmed();
				deathCase += cvoidInfoDTOList.get(i).getDeaths();
				recoveryCase += cvoidInfoDTOList.get(i).getRecovered();
				incidentRatio += cvoidInfoDTOList.get(i).getIncidentRate();
				caseFacilityRatio += cvoidInfoDTOList.get(i).getCaseFatalityRatio();
			}
			if (name.equals("overAllCase")) {
				countryRegion.add(cvoidInfoDTOList.get(i).getCountryRegion());
				provisionState.add(cvoidInfoDTOList.get(i).getProvinceState());
				cityAdmin.add(cvoidInfoDTOList.get(i).getAdmin2());
				cityStateCountry.add(cvoidInfoDTOList.get(i).getCombinedKey());

			}
		}
		cvoidInfoDTO.setActive(activeCase);
		cvoidInfoDTO.setDeaths(deathCase);
		cvoidInfoDTO.setConfirmed(confirmedCase);
		cvoidInfoDTO.setRecovered(recoveryCase);
		cvoidInfoDTO.setCaseFatalityRatio(caseFacilityRatio);

		System.out.println("countryRegion" + countryRegion.size());
		System.out.println("provisionState" + provisionState.size());
		System.out.println("cityAdmin" + cityAdmin.size());
		System.out.println("cityStateCountry" + cityStateCountry.size());
		return cvoidInfoDTO;

	}

	public void mappingOverallData() {

	}

}
