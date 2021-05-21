package com.covid.info.covidinfo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;
import com.covid.info.covidinfo.bean.FinalData;
import com.covid.info.covidinfo.repository.CvoidInfoDTORepository;

@Service
@Transactional
public class CvoidInfoDTOService {

	@Autowired
	private CvoidInfoDTORepository repo;

	@Autowired
	private FinalData fd;

	@Autowired
	private MapperObject mo;

	List<CvoidInfoDTO> cvoidInfoDTOList = new ArrayList<CvoidInfoDTO>();
	static Set<String> countryRegion = new HashSet<String>();
	Set<String> provisionState = new HashSet<String>();
	Set<String> cityAdmin = new HashSet<String>();
	Set<String> cityStateCountry = new HashSet<String>();
	public void details(List<CvoidInfoDTO> cvoidInfoDTOList) {

	}

	public List<CvoidInfoDTO> listAll() {
		cvoidInfoDTOList = repo.findAll();
		return cvoidInfoDTOList;
	}

	public void save(CvoidInfoDTO cvoidInfoDTO) {
		repo.save(cvoidInfoDTO);
	}

	public CvoidInfoDTO get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

	public CvoidInfoDTO getCovidDataByCity(String cityName) {
		return mo.mappingCountryStateCity(cityName, cvoidInfoDTOList);
	}

	public CvoidInfoDTO getCovidDataByprovinceState(String stateName) {
		return mo.mappingCountryStateCity(stateName, cvoidInfoDTOList);

	}

	public CvoidInfoDTO getCovidDataByCounrty(String countryName) {
		return mo.mappingCountryStateCity(countryName, cvoidInfoDTOList);
	}

	public CvoidInfoDTO overAllData() {
		return mo.mappingCountryStateCity("overAllCase", cvoidInfoDTOList);
		
	}
}

// public List<CvoidInfoDTO> listAll()
// {
//
// }
